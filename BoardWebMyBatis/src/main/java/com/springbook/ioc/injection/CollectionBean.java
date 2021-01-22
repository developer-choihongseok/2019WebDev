package com.springbook.ioc.injection;

import java.util.Properties;

public class CollectionBean {
	
	// 1. List 활용
//	private List<String> addressList;
//		
//	public void setAddressList(List<String> addressList) {
//		this.addressList = addressList;
//	}
//	
//	public List<String> getAddressList(){
//		return addressList;
//	}
	
	// 2. Set 활용
//	private Set<String> addressList;
//	
//	public void setAddressList(Set<String> addressList) {
//		this.addressList = addressList;
//	}
//	
//	public Set<String> getAddressList(){
//		return addressList;
//	}
	
	// 3. Map 활용
//	private Map<String, String> addressList;
//	
//	public void setAddressList(Map<String, String> addressList) {
//		this.addressList = addressList;	
//	}
//	
//	public Map<String, String> getAddressList() {
//		return addressList;
//	}
	
	
	// 4. Properties 활용 - key와 value가 String으로 특화된 Map.
	private Properties addressList;
	
	public void setAddressList(Properties addressList) {
		this.addressList = addressList;	
	}
	
	public Properties getAddressList() {
		return addressList;
	}
}
