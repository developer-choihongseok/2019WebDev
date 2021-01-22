package com.springbook.ioc.injection;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		
		CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
		
		// 1,2. List, Set 활용
//		CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
//		Set<String> addressList = bean.getAddressList();
//		for (String address : addressList) {     // 확장 for문
//			System.out.println(address.toString());     // 이때, toString()은 생략가능하다.
//		}
		
		// 3. Map 활용
//		Map<String, String> addressList = bean.getAddressList();
//		Set<String> names = addressList.keySet();
//		Iterator<String> it = names.iterator();
//		while(it.hasNext()) {
//			String name = it.next();
//			String address = addressList.get(name);
//			System.out.println("(" + name + " : " + address + ")");
//		}
		
		// 4. Properties 활용
		Properties addressList = bean.getAddressList();
		Set<Object> names = addressList.keySet();
		Iterator<Object> it = names.iterator();
		while(it.hasNext()) {
			String name = (String) it.next();
			String address = addressList.getProperty(name);
			System.out.println("{" + name + " : " + address + "}");
		}
		
		factory.close();
	}
	
}
