package com.mycom;

public class ReaderFactory extends AbstractFactory {
	
	private static ReaderFactory instance = new ReaderFactory(); //single instance
	private ReaderFactory(){}; //lock constructor
	
	public static ReaderFactory getInstance(){
		return instance; // returns only instance of factory
	}
	
	public Read getReader(String type){
		if (type == null){
			return null;
		}
		
		if (type.equalsIgnoreCase("JSON")){
			return new ReadJson();
		}
		
		if(type.equalsIgnoreCase("XML")){
			//return new ReadXML();
		}
		
		return null;
	}
	
	public Write getWriter(String type){
		return null;
	}
	
}
