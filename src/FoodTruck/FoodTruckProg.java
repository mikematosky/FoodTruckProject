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
		
		int selection=0;
		
		while(selection!=4) {
			System.out.println("==============Menu=============");
			System.out.println("1) List all existing Food Trucks");
			System.out.println("2) See the average rating of Food Trucks");
			System.out.println("3) Display the highest rated Food Truck");
			System.out.println("4) Quit the program");
			System.out.println("===============================");
			selection= scan.nextInt();
			if(selection < 1 || selection > 4) {
				System.out.println("Invalid choice- 1-4: ");
				continue;
			}
			else {
				switch (selection) {
				case 1:
					for(int i=0; i < 5; i++) {
						fT[i].toString();
					}
					break;
				case 2:
					double total=0;
					double average=0.0;
					int index1=0;
					while(fT[index1].getRating() != null) {
						total= total+ fT[index1].getRating();
						index1++;
					}
					average= total/ index1;
					System.out.println("The average ratings for FoodTrucks is: "+average);
					break;
				case 3:
					double highest=0;
					int index2=0;
					int highestIndex=0;
					while(fT[index2].getRating() != null) {
						if(fT[index2].getRating() >highest) {
							highest= fT[index2].getRating();
							highestIndex= index2;
						}
						index2++;
					}
					System.out.println("The highest rated restaurant is "+fT[highestIndex].getTruckName()+" with a rating of: "+fT[highestIndex].getRating());
					break;
				case 4:
					System.out.println("Goodbye!!");
					break;
				};
			}
			
		}
		
	}
		
	

}
