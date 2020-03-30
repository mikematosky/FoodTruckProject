package FoodTruck;

public class FoodTruck {

	private String truckName;
	private String truckFood;
	private double rating;
	
	private int truckID;
	public int currentID=111; 
	private int setID() {
		return currentID++;
	}
	
	
	public FoodTruck(String name, String food, double rating) {
		this.truckName= name;
		this.truckFood= food;
		this.rating= rating;
		this.truckID= setID();
		
	}
	
	
}
