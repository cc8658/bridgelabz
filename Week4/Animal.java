class Animals{
	String name;
	int age;
}
	
	class Dog extends Animals{
		//@Override
		void makeSound(){
			System.out.println(name+"\n" +age+"\n"+ "BOW, BOW"+"\n");
		}
	}
	
	class Cat extends Animals{
		void makeSound(){
			System.out.println(name+"\n" +age+"\n"+"MEOW, MEOW"+"\n");
		}
	}
	
	class Bird extends Animals{
		void makeSound(){
			System.out.println(name+"\n" +age+"\n"+"KUKU, KUKU");
		}
	}
	
	class Animal{
	public static void main(String[] args){
		
		Dog dog1 = new Dog();
		dog1.name="huppy";
		dog1.age=05;
		dog1.makeSound();
		
		Cat cat1 = new Cat();
		cat1.name="snoopy";
		cat1.age=1;
		cat1.makeSound();
		
		Bird bird1=new Bird();
		bird1.name="pet";
		bird1.age=2;
		bird1.makeSound();
		
		
		
	}
}

		