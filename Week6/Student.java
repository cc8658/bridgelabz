class Student{
	private static String universityName;
	private String name;
	private final String rollNumber;
	private double grade;
	
	Student(String name,String rollNumber,double grade){
		this.name=name;
		this.rollNumber=rollNumber;
		this.grade=grade;
	}
	
	static void setUniversityName(String name){
		universityName=name;
	}
	static void displayuniversityname(){
		System.out.println("University Name: "+universityName);
	}
	
	void displayTotalStudents(Object ob){
		if(ob instanceof Student){
			System.out.println("Name of Student: "+name);
			System.out.println("Roll Number: "+rollNumber);
			System.out.println("Grade: "+grade+"\n");
		}
		else{
			System.out.println("Object is out of class");
		}
	}
	
	public static void main(String[] args){
		Student.setUniversityName("SRM University");
		Student.displayuniversityname();
		Student one = new Student("Varma","RA21110276438",8.9);
		Student two = new Student("Vardhan","RA23456754234",9);
		one.displayTotalStudents(one);
		two.displayTotalStudents(two);
	}
}