package Org.Java.Section9;

import java.util.Scanner;

public class GroceryMain2 {
	private static Scanner sc = new Scanner(System.in);
	public static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printinstruction();

		while (!quit) {
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 0:
				printinstruction();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				quit = true;
				break;

			}
		}
	}

	public static void printinstruction() {
		System.out.println("\nPress ");
		System.out.println("\t 1- to print the grocery item");
		System.out.println("\t 2- to add item to the list");
		System.out.println("\t 3- to modify an item in the list");
		System.out.println("\t 4- to remove an item from the list");
		System.out.println("\t 5- to search for an iteam in the list");
		System.out.println("\t 6- to quit the application");
	}

	public static void addItem() {
		System.out.println("please enter Grocery Item");
		groceryList.addGroceryItem(sc.nextLine());	
	}

	public static void modifyItem() {
		System.out.print("enter Item number");
		int itemNo = sc.nextInt();
		sc.nextLine();
		System.out.println("enter replace Item");
		String newItem = sc.nextLine();
		groceryList.modifyGroceryItem(itemNo-1, newItem);
	}

	public static void removeItem() {
		System.out.println("Enter item Number.\r");
		int itemNo = sc.nextInt();
		sc.nextLine();
		groceryList.removeGroceyItem(itemNo-1);
	}

	public static void searchForItem() {
		System.out.print("enter the iteam search for");
		String seach = sc.nextLine();
		if (groceryList.findItem(seach) != null) {
			System.out.println("Found  " + seach + " in our Grocey list");
		} else {
			System.out.println(seach + "  is not in shopping List");
		}
	}
}
