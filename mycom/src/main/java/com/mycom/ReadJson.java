package com.mycom;

import java.io.File;
import java.io.IOException;



import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class ReadJson implements Read {
	
	public MenuList read(String location){
	
		ObjectMapper mapper = new ObjectMapper(); 
	
		MenuList value = null;
		
		try{
			
			value = mapper.readValue(new File(location), MenuList.class);
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return value;
	}
}
