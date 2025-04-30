class HotelBooking{
	String guestname;
	String roomtype;
	int nights;
	
	HotelBooking(){
		guestname="Varma";
		roomtype="single";
		nights=2;
	}
	HotelBooking(String guestname,String roomtype,int nights){
		this.guestname=guestname;
		this.roomtype=roomtype;
		this.nights=nights;
	}
	HotelBooking(HotelBooking others){
		this.guestname=others.guestname;
		this.roomtype=others.roomtype;
		this.nights=others.nights;
	}
	
	
	public void display(){
		System.out.println("Guest Name is: "+guestname);
		System.out.println("Room Type: "+roomtype);
		System.out.println("NO.OF Nights: "+nights+"\n");
	}
	public static void main(String[] args){
		HotelBooking one=new HotelBooking();
		HotelBooking two=new HotelBooking("Hema","Double",5);
		HotelBooking three=new HotelBooking(two);
		one.display();
		two.display();
		three.display();
	}
}
		
		

	
	
	