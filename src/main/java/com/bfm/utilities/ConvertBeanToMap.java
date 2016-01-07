package com.bfm.utilities;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ConvertBeanToMap {
	public static Map<String,String> convertBeanToMap(Object bean) throws IllegalArgumentException, IllegalAccessException{  
        Field[] fields = bean.getClass().getDeclaredFields();  
        HashMap<String,String> data = new HashMap<String,String>();  
        for(Field field : fields){  
            field.setAccessible(true);  
            data.put(field.getName(), (String) field.get(bean));  
            System.out.println(field.getName() + ": " +field.get(bean));
        }  
        return data;  
	}
}
