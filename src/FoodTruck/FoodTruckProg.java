package FoodTruck;

import java.util.Scanner;

public class FoodTruckProg {
	
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		FoodTruck[] fT= new FoodTruck[5];
		double rating;
		String name, food; 
		
		/*
		 * Populate the array up to 5 food trucks. Use a constructor with the arguments
		 * instead of the setters. I print the name and food of the food truck to help
		 * with troubleshooting and to error checking
		 */
		for(int i= 0; i < 5; i++) {
			System.out.println("Please enter the name of the FoodTruck or \"quit\" to exit:");
			name= scan.next(); //skips this?
			if(name.equalsIgnoreCase("quit")) {
				i=6;
				break;
			}
			else {
				System.out.println("Please enter the food type (chicken, pizza, lemonade):");
				food= scan.next();
				System.out.println("Please enter the rating for "+name+" "+food+": ");
				rating= scan.nextDouble();
				
				FoodTruck foodT= new FoodTruck(name, food, rating);
				fT[i]= foodT;
				System.out.println(fT[i].toString());
			}
		}
		
		//going to be used for the upcoming menu
		int selection=0;

		/*
		 * You are going to print a Menu unless the selection is 4 which is to quit. 
		 * There is a switch statement for operations 1-3 and an error check for < 1 and > 4. 
		 */
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
				//PRINT OUT ALL OF THE FOOD TRUCKS AND THEIR INFO
				case 1:
					for(int i=0; i < 5; i++) {
						if(fT[i]==null) {//watch out for nulls
							break;
						}
						System.out.println(fT[i].toString());
					}
					break;
				//CALCULATE THE AVERAGE OF RATINGS
				case 2:
					double total=0;
					double average=0.0;
					for(int i=0; i<5;i++) {
						if(fT[i]==null) {//watch out for nulls
							break;
						}
						total= total + fT[i].getRating();
						average= total/(i+1);
					}
					System.out.println("The average ratings for FoodTrucks is: "+average);
					break;
				//FIND THE HIGHEST RATED FOOD TRUCK
				case 3:
					double highest=0;
					int highestIndex=0;
					for(int i=0; i < 5; i++) {
						if(fT[i]==null) { //watch out for nulls
							break;
						}
						if(fT[i].getRating() > highest) {
							highest= fT[i].getRating();
							highestIndex= i;
						}
					}
					System.out.println("The highest rated restaurant is "+fT[highestIndex].getTruckName()+" with a rating of: "+fT[highestIndex].getRating());
					break;
				case 4:
					System.out.println("Goodbye!!");
					break;
				};
			}
			
		}
		scan.close(); //Never Forget
	}
		
}
