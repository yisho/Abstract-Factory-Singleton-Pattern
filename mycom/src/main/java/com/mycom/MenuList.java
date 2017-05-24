package com.mycom;

import java.util.ArrayList;
import java.util.List;

/*
 * Model to put each FoodItem into a Menu list 
 */

public class MenuList {
		public List<FoodItem> FoodItemData = new ArrayList<FoodItem>();
			
		public List<FoodItem> getMenu(){
			return FoodItemData;
		}
			
		public String toString() {
			return "Menu\n {FoodItemData:\n" + FoodItemData + "}";
		}
}

