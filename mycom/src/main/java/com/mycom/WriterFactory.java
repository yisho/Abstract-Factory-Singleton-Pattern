package com.mycom;

public class WriterFactory extends AbstractFactory {
	
	private static WriterFactory instance = new WriterFactory(); //creates one static instance
	private WriterFactory(){}; //locks the constructor
	
	public static WriterFactory getInstanc(){ //returns static instance of factory
		return instance;
	}
	
	public Read getReader(String type){
		return null;
	}
	
	public Write getWriter(String type){
		
		if(type == null){
			return null;
		}
		
		if(type.equalsIgnoreCase("TEXT")){
			return new WriteText();
		}
		
		if(type.equalsIgnoreCase("XML")){
			//return new WriteXML();
		}
		
		if(type.equalsIgnoreCase("HTML")){
			//return new WriteHTML();
		}
		
		return null;
	}

}
