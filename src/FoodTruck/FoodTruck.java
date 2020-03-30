package FoodTruck;

public class FoodTruck {

	private String truckName;
	private String truckFood;
	private Double rating;
	
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
	
	
	
	
	
	public String getTruckName() {
		return truckName;
	}


	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}


	public String getTruckFood() {
		return truckFood;
	}


	public void setTruckFood(String truckFood) {
		this.truckFood = truckFood;
	}


	public Double getRating() {
		return rating;
	}


	public void setRating(Double rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Name: "+this.truckName+" || Food Type: "+this.truckFood+" || Rating:  "+this.rating+" || ID Number: "+this.truckID;
	}
	
	
}
