
package com.bfm.main;

/**
 *  ������
 *
 */
public class BaiduMain {

	
public static void main(String[] args) throws Exception {
        
	//��֤�˺Ų���ȡcookie
		String cookie  =  BaiduTieBaNDWS.testAccount("admin", "222222");
		//����
		String info = BaiduTieBaNDWS.reply("�������ţB������", "http://tieba.baidu.com/p/1193625840", cookie);
		//��ӡ������Ϣ
		System.out.println(info);
	}
}