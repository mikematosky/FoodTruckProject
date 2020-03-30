package FoodTruck;

import java.util.Scanner;

public class FoodTruckProg {
	
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		FoodTruck[] fT= new FoodTruck[5];
		double rating; //holder variable for creating a Truck
		String name, food; //holder variables for creating a Truck
		
		
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
						if(fT[i]==null) {
							break;
						}
						System.out.println(fT[i].toString());
					}
					break;
				case 2:
					double total=0;
					double average=0.0;
					int index1=0;
					for(int i=0; i<5;i++) {
						if(fT[i]==null) {
							break;
						}
						total= total + fT[i].getRating();
						average= total/(i+1);
					}
					System.out.println("The average ratings for FoodTrucks is: "+average);
					break;
				case 3:
					double highest=0;
					int index2=0;
					int highestIndex=0;
					for(int i=0; i < 5; i++) {
						if(fT[i]==null) {
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
		
	}
		
	

}
