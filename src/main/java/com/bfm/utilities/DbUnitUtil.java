package com.bfm.utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.dbunit.util.Base64.InputStream;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DbUnitUtil {
	  public static IDatabaseConnection dbunitCon;
	  private File tempFile;
	 
	  @BeforeClass
	  public static void init() throws DatabaseUnitException, SQLException {
	    dbunitCon = new DatabaseConnection(DbUtil.getConnection());
	  }
	 
	  @SuppressWarnings("deprecation")
	protected IDataSet createDateSet(String tname) throws DataSetException, IOException {
	    InputStream is = (InputStream) DbUnitUtil.class.getClassLoader().getResourceAsStream(tname + ".xml");
	    Assert.assertNull("dbunit的基本数据文件不存在");
	    return new FlatXmlDataSet(is);
	  }
	 
	  protected void backupAllTable() throws SQLException, IOException, DataSetException {
	    IDataSet ds = dbunitCon.createDataSet();
	    writeBackupFile(ds);
	  }
	 
	  private void writeBackupFile(IDataSet ds) throws IOException, DataSetException {
	    tempFile = File.createTempFile("back", "xml");
	    FlatXmlDataSet.write(ds, new FileWriter(tempFile));
	  }
	 
	  protected void backupCustomTable(String[] tname) throws DataSetException, IOException, SQLException {
	    QueryDataSet ds = new QueryDataSet(dbunitCon);
	    for (String str : tname) {
	      ds.addTable(str);
	    }
	    writeBackupFile(ds);
	  }
	 
	  protected void bakcupOneTable(String tname) throws DataSetException, IOException, SQLException {
	    backupCustomTable(new String[] { tname });
	  }
	 
	  protected void resumeTable() throws DatabaseUnitException, SQLException, IOException {
	    IDataSet ds = new FlatXmlDataSet(tempFile);
	    DatabaseOperation.CLEAN_INSERT.execute(dbunitCon, ds);
	  }
	 
	  @AfterClass
	  public static void destory() {
	    try {
	      if (dbunitCon != null)
	        dbunitCon.close();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	  }
	}