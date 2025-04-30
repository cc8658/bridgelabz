class Vehicle{
	static double registrationFee=2534.43;
	String ownerName;
	String vehicleType;
	final String registrationNumber;
	
	Vehicle(String ownerName,String vehicleType,String registrationNumber){
		this.vehicleType=vehicleType;
		this.ownerName=ownerName;
		this.registrationNumber=registrationNumber;
	}
	
	static  void updateRegistrationFee(){
		System.out.println("Registration Fee: "+registrationFee);
	}
	
	void displayResult(Object ob){
		if(ob instanceof Vehicle){
			System.out.println("Owner Name: "+ownerName);
			System.out.println("Vehicle Type: "+vehicleType);
			System.out.println("Registration Number: "+registrationNumber);
		}
	}
	
	public static void main(String[] args){
		Vehicle.updateRegistrationFee();
		Vehicle one=new Vehicle("Varma","Sports","AP40JE5257");
		one.displayResult(one);
	}
}
		