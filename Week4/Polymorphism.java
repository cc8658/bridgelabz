// overriding
class Tata{
	public void dot(){
		System.out.println("We are TATA Industires");
	}
}
class Motors extends Tata{
	public void dot(){
		System.out.println("TATA Moters is a part of TATA Industries");
	}
}
class Tcs extends Tata{
	public void dot(){
		System.out.println("TCS is a Part of TATA Industries");
	}
}
class Polymorphism{
	public static void main(String[] args){
		Tata mywords = new Tata();
		Tata myvehicles = new Motors();
		Tata mycompany = new Tcs();
		mywords.dot();
		myvehicles.dot();
		mycompany.dot();
	}
}
	
		
	