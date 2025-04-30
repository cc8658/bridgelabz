class Person{
	String name;
	int age;
	String gender;
	Person(){
		name="Hemanth";
		age=20;
		gender="Male";
	}
	Person(String name,int age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	Person(Person CloneData){
		this.name=CloneData.name;
		this.age=CloneData.age;
		this.gender=CloneData.gender;
	}
	void display(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
	}
	public static void main(String[] args){
		Person one=new Person();
		Person two=new Person("Sagar",15,"Male");
		Person three=new Person(two);
		one.display();
		two.display();
		three.display();
	
	}
}
		