package com.bfm.request.bondInstruction;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;

import com.bfm.bean.BondbsInstrBean;
import com.bfm.bean.Result;
import com.bfm.dict.Dict;
import com.bfm.util.ConvertBeanToMap;
import com.bfm.util.SendRequest;
/*
 *ծȯ����ָ���
 */
public class BondbdsInstrService {

	public static Result submitBondInstr(BondbsInstrBean instr,String cookie) throws ClientProtocolException, IOException, IllegalArgumentException, IllegalAccessException  {
		Map<String,String> parameters = new HashMap<String,String>();
		Map<String,String> headers = new HashMap<String,String>();		
		parameters = ConvertBeanToMap.convertBeanToMap(instr);
		
		headers.put("Referer", "http://192.168.54.66:7001/bfmcpv20/bfm.bondbiz.bondbsd.BondbsdInstr.service");
		headers.put("Host", Dict.host);
		headers.put("Cookie",cookie);
		
		Result rs = SendRequest.sendPost(Dict.url+Dict.bondbsdInstrService, headers, parameters,"utf-8");
		return rs;
	}
}
