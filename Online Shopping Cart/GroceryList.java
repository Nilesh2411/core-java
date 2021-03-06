package Org.Java.Section9;

import java.util.ArrayList;

// concept of array list
public class GroceryList {
	/*
	 * we are creating array list with type string we added brackets in the end
	 * because arrayList is class it can empty constructor
	 */

	private ArrayList<String> groceryList = new ArrayList<String>();

	public void addGroceryItem(String item) {
		groceryList.add(item);// it will add data we dont need to define size
	}

	public void printGroceryList() {
		System.out.println("you have " + groceryList.size() + " items in your grocery list");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i + 1) + ". " + groceryList.get(i));
		}
	}

	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocey item " + (position+1 ) + " has been modified ");
	}

	public void removeGroceyItem(int position) {
		String theitem = groceryList.get(position);
		groceryList.remove(position);
	}

	public String findItem(String searchItem) {
		// boolean exits=groceryList.contains(searchItem);
		int position = groceryList.indexOf(searchItem);
		if (position >= 0) {
			return groceryList.get(position);
		}
		return null;

	}
}
