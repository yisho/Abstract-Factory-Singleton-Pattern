package com.mycom;

import java.io.File;
import java.io.IOException;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class WriteText implements Write {
	
	public void write(String location, MenuList menu){
		
		MenuOutput menuOutput = new MenuOutput();
		
		menuOutput.fillMenu(menu);
		
		ObjectMapper mapper = new ObjectMapper();
		
		location = location + "\\\\output.json";
		
		try{
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File(location), menuOutput);
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
