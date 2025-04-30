class Course{
	String courseName;
	int duration;
	double fee;
	static String instituteName="SRMIST";
	
	Course(String courseName,int duration, double fee){
		this.courseName=courseName;
		this.duration=duration;
		this.fee=fee;
	}
	void displayCourseDetails(){
		System.out.println("Course Name: "+courseName);
		System.out.println("Duration in Months: "+duration);
		System.out.println("Fee: "+fee+"\n");
	}
	static void updateInstituteName(){
		System.out.println("Institute Name: "+instituteName+"\n");
	}
	public static void main(String[] args){
		
		Course.updateInstituteName();
		Course one=new Course("Operating System",3,10000);
		Course two=new Course("Computer Communications",4,9000);
		Course three=new Course("Java Fundamentals",3,7000);
		one.displayCourseDetails();
		two.displayCourseDetails();
		three.displayCourseDetails();		
	}
}
	