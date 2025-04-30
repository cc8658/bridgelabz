class Vehicles{
	double maxSpeed;
	String fuelType;
	void displayInfo(){
		System.out.println("Max Speed: "+maxSpeed);
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("Seating Capacity: "+seatCapacity);
	}
}

class Car extends Vehicles{
	int seatCapacity;
}
class Truck extends Vehicles{
	int seatCapacity;
}
class Motorcycle extends Vehicles{
	int seatCapacity;
}
class Vehicle{
	public static void main(String[] args){
		Car car1=new Car();
		
	
