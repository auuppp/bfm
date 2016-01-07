package com.bfm.request.login;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.ClientProtocolException;
import com.bfm.bean.Result;
import com.bfm.dict.Dict;
import com.bfm.http.bean.LoginHttpVO;
import com.bfm.utilities.SendRequest;
/*
 * 	��½����
 */
public class LoginService {
	public static  Result login(LoginHttpVO login) throws ClientProtocolException, IOException {
		String forceLoginFlag = null;
		forceLoginFlag = login.getForceLoginFlag().toLowerCase();
		switch(login.getForceLoginFlag().toLowerCase()){
		
		}
		
		Map<String,String> parameters = new HashMap<String,String>();
		parameters.put("password", login.getPassWord());
		parameters.put("loginName", login.getUserName());
		parameters.put("opCode", login.getOpCode());
		parameters.put("resCode", login.getResCode());
		Result rs = SendRequest.sendPost(Dict.url+Dict.loginService, null, parameters,"utf-8");
		return rs;
	}
	
	public static Result loginSecond(String name, String password) throws ClientProtocolException, IOException {
		Map<String,String> parameters = new HashMap<String,String>();
		parameters.put("password", password);
		parameters.put("loginName", name);
		parameters.put("opCode", "bizSignIn2");
		parameters.put("resCode", "bizSign");
		parameters.put("forcedLoginFlag", "1");
		Result rs = SendRequest.sendPost(Dict.url+Dict.loginService, null, parameters,"utf-8");
		return rs;
	}
}
