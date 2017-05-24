package com.mycom;

import java.util.*;

/*
 * Model for the menu that is to be outputted.
 */

public class MenuOutput {
	public List<ItemOutput> Breakfast = new ArrayList<ItemOutput>();
	public List<ItemOutput> Lunch = new ArrayList<ItemOutput>();
	public List<ItemOutput> Dinner = new ArrayList<ItemOutput>();
	public List<ItemOutput> Dessert = new ArrayList<ItemOutput>();
	public List<ItemOutput> SideDish = new ArrayList<ItemOutput>();
	public List<ItemOutput> Appetizer = new ArrayList<ItemOutput>();
	public List<ItemOutput> Snack = new ArrayList<ItemOutput>();
	
	public void fillMenu(MenuList menu){
		for(FoodItem i: menu.FoodItemData){
			ItemOutput temp = new ItemOutput();
			temp.name = i.name;
			temp.description = i.description;
			temp.price = i.price;
			temp.type = i.category;
			
			if(temp.type.equalsIgnoreCase("BREAKFAST")){
				Breakfast.add(temp);
			}
			else if(temp.type.equalsIgnoreCase("LUNCH")){
				Lunch.add(temp);
			}
			else if(temp.type.equalsIgnoreCase("DINNER")){
				Dinner.add(temp);
			}
			else if(temp.type.equalsIgnoreCase("DESSERT")){
				Dessert.add(temp);
			}
			else if(temp.type.equalsIgnoreCase("SIDE DISH")){
				SideDish.add(temp);
			}
			else if(temp.type.equalsIgnoreCase("SNACK")){
				Snack.add(temp);
			}
			else if(temp.type.equalsIgnoreCase("APPETIZER")){
				Appetizer.add(temp);
			}
		}
	}
}
