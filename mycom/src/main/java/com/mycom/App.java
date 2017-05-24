package com.mycom;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		
		//COMMANDLINE PROMPT
		System.out.println("Please input file path to json file in zipped project");
		System.out.println("WARNING: MAKE SURE TO USE TWO \\\\ BETWEEN DIRECTORIES!");
		Scanner scanner = new Scanner(System. in);
		String location = scanner.nextLine();
		System.out.println("\nnow please input path to folder to write output to");
		System.out.println("WARNING: MAKE SURE TO USE TWO \\\\ BETWEEN DIRECTORIES!");
		String location2 = scanner.nextLine();
		System.out.println("Creating json menu\n");
		//COMMANDLINE PROMPT
		
		
		MenuList menu = null;
		
		AbstractFactory readFactory = FactoryProducer.getFactory("READ");
		Read json = readFactory.getReader("JSON");
		menu = json.read(location);
		
		AbstractFactory writeFactory = FactoryProducer.getFactory("WRITE");
		Write text = writeFactory.getWriter("TEXT");
		text.write(location2, menu);
		
		
		
		
		
	}
}

