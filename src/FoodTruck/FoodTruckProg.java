package FoodTruck;

import java.util.Scanner;

public class FoodTruckProg {
	
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		FoodTruck[] fT= new FoodTruck[5];
		int counter=0; //counter for the while loop to populate the array
		double rating; //holder variable for creating a Truck
		String name, food; //holder variables for creating a Truck
		
		while(counter < 5) {
			System.out.println("Please enter the name of the FoodTruck or \"quit\" to exit:");
			name= scan.nextLine();
			if(name.equalsIgnoreCase("quit")) {
				break;
			}
			else {
				System.out.println("Please enter the food type (chicken, pizza, lemonade):");
				food= scan.nextLine();
				System.out.println("Please enter the food truck's rating: ");
				rating= scan.nextDouble();
				
				FoodTruck foodT= new FoodTruck(name, food, rating);
				fT[counter]= foodT;
				
				counter++;
			}
			
		}
		
	}
	
	
	public void printMenu() {
		System.out.println("==============Menu=============");
		System.out.println("1) List all existing Food Trucks");
		System.out.println("2) See the average rating of Food Trucks");
		System.out.println("3) Display the highest rated Food Truck");
		System.out.println("4) Quit the program");
		System.out.println("===============================");
	}
	

}
