class CarRental{
	String customername;
	String carmodel;
	int rentaldays;
	double rent;
	double totalrent;
	
	CarRental(){
		customername="Varun";
		carmodel="TATA Nexon";
		rentaldays=6;
		rent=5000;
		totalrent=rent*rentaldays;
	}
	CarRental(String customername, String carmodel, int rentaldays, double rent){
		this.customername=customername;
		this.carmodel=carmodel;
		this.rentaldays=rentaldays;
		this.rent=rent;
		this.totalrent=rent*rentaldays;
	}
	void display(){
		System.out.println("Customer Name: "+customername);
		System.out.println("Car Model: "+carmodel);
		System.out.println("Rental Days: "+rentaldays);
		System.out.println("Rent: "+rent);
		System.out.println("Total Cost: "+totalrent+"\n");
	}
	public static void main(String[] args){
		CarRental one=new CarRental();
		CarRental two=new CarRental("hema","Kia",8,12500.5);
		CarRental three=new CarRental("hemanth","Skoda",12,14567.5);
		one.display();
		two.display();
		three.display();
	}
}