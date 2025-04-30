class Employee{
	private static String companyName;
	private String name;
	private final int id;
	private String designation;
	
	Employee(String name, int id, String designation){
		this.name=name;
		this.id=id;
		this.designation=designation;
	}
	public static void setcompanyName(String Name){
		companyName=Name;
	}
	public static void displaycompanyName(){
		System.out.println("Company Name: "+companyName);
	}
	public void displayTotalEmployees(Object obj){
		if(obj instanceof Employee){
			System.out.println("Employee Name: "+name);
			System.out.println("Employee ID: "+id);
			System.out.println("Employee Designation: "+designation+"\n");
		}
		else{
			System.out.println("The Object is not instance of class");
		}
	}
	public static void main(String[] args){
		Employee.setcompanyName("BridgeLabz");
		Employee.displaycompanyName();
		Employee one = new Employee("Vardhan",14321,"Backend Developer");
		Employee two = new Employee("Hemanth",87655,"Software Engineer");
		String three="no value";
		one.displayTotalEmployees(one);
		two.displayTotalEmployees(two);
		two.displayTotalEmployees(three);
	}
}