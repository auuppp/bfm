package com.bfm.utilities;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class XmlToJavaVO {        
    
    @SuppressWarnings("rawtypes")
	private static List l;
    
    public XmlToJavaVO() {    
        this.getXmlData();        
    }
    
    public void getXmlData(){
        ParserXml p = new ParserXml();
        l = p.parser3Xml(new File("src/TestData.xml").getAbsolutePath());
    }

	@SuppressWarnings({ "rawtypes", "unchecked" })
    public static List getXmlVO(){        
        List oList = new ArrayList();; 
        l = (new ParserXml()).parser3Xml(new File("src/TestData.xml").getAbsolutePath());
        for (int i = 0; i < l.size(); i++) {
            Map m = (Map) l.get(i);  
            String key = (String)m.keySet().iterator().next();
            Class<?> demo = null;
            Object obj = null;
            try{
            	demo = Class.forName("com.bfm.VO." + key);
            }catch(Exception e){
            	e.printStackTrace();
            }
            try{
            	obj = demo.newInstance();
            }catch(Exception e){
            	e.printStackTrace();
            }
            Map<String, String> dm = (Map<String, String>) m.get(key);
            
            for(Entry<String, String> entry: dm.entrySet()){
            	String key1 = entry.getKey();
            	String value = entry.getValue();
            	setter(obj,key1,value,String.class);
            }
            oList.add(obj);
        }  
        return oList;
    }
    
    
    /**
     * @param obj
     *            操作的对象
     * @param att
     *            操作的属性
     * @param value
     *            设置的值
     * @param type
     *            参数的属性
     * */
    public static void setter(Object obj, String att, Object value,
            Class<?> type) {
        try {
            Method method = obj.getClass().getMethod("set" + att, type);
            method.invoke(obj, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/*    
    @SuppressWarnings("rawtypes")
	public static void main(String[] args) {
    	List list = XmlToJavaVO.providerMethod();
    	for(int i=0;i<list.size();i++){  
    		testMethod1 mthod =(testMethod1) list.get(i);
            System.out.println(mthod.getButton());  
        } 
    }*/
}