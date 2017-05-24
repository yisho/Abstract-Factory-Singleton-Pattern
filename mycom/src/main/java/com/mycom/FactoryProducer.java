package com.mycom;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice){
		
		if(choice.equalsIgnoreCase("READ")){
			AbstractFactory instance = ReaderFactory.getInstance(); //returns the only instance of readerfactory
			return instance;
		}
		
		if(choice.equalsIgnoreCase("WRITE")){
			AbstractFactory instance = WriterFactory.getInstanc();//returns the only instance of writerfactory
			return instance;
		}
		
		return null;
	}

}
