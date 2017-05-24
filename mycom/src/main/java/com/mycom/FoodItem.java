package com.mycom;

/*
 * Model for each Food item retrieved from FoodItemData.json
 */

public class FoodItem {
	
	public String country;
	public int id;
	public String name;
	public String description;
	public String category;
	public double price;
	
	public String getCountry(){
		return country;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDesc(){
		return description;
	}
	
	public String getCat(){
		return category;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String toString(){
		return "\n{country: " + country +
				"\nid: " + id + 
				"\nname: " + name +
				"\ndescription: " + description +
				"\ncategory: " + category +
				"\nprice: " + price + "}";
	}

}
