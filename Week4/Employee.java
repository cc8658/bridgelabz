class Employees{
	String name;
	int id;
	double salary;
}
class Manager extends Employees{
	void displayDetails(){
		System.out.println("Manager Name: "+name);
		System.out.println("Manager ID: "+id);
		System.out.println("Manager Salary: "+salary);
	}
}
class Developer extends Employees{
	void displayDetails(){
		System.out.println("Developer Name: "+name);
		System.out.println("Developer ID: "+id);
		System.out.println("Developer Salary: "+salary);
	}
}
class Intern extends Employees{
	void displayDetails(){
		System.out.println("Intern Name: "+name);
		System.out.println("Intern ID: "+id);
		System.out.println("Intern Salary: "+salary);
	}
}
class Employee{
public static void main(String[] args){
	Manager man1=new Manager();
	man1.name="SUN";
	man1.id=423;
	man1.salary=58394;
	man1.displayDetails();
	Developer dev1=new Developer();
	dev1.name="Varma";
	dev1.id=213;
	dev1.salary=6504;
	dev1.displayDetails();
	Intern int1=new Intern();
	int1.name="Vardhan";
	int1.id=98;
	int1.salary=23423.2;
	int1.displayDetails();
	
}
}
	
	