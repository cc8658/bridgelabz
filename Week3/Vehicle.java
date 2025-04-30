class Vehicle{
	String ownerName;
	String vehicleType;
	static double registrationFee;
	Vehicle(String ownerName, String vehicleType,double registrationFee){
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		this.registrationFee=registrationFee;
	}
	void displayVehicleDetails(){
		System.out.println("Owner Name: "+ownerName);
		System.out.println("Vehicle Type: "+vehicleType);
		
	}
	static void updateRegistrationFee(){
		System.out.println("Registration Fee: "+registrationFee+"\n");
	}
	
	public static void main(String[] args){
		Vehicle one=new Vehicle("Varma","Sport",20023.4);
		one.displayVehicleDetails();
		one.updateRegistrationFee();
		Vehicle two = new Vehicle("Sagar","Classic",15200);
		two.displayVehicleDetails();
		two.updateRegistrationFee();
		Vehicle three = new Vehicle("Raju","Sport",12000);
		three.displayVehicleDetails();
		three.updateRegistrationFee();
	}
}