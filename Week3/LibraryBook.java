class LibraryBook{
	String title;
	String author;
	int price;
	boolean availability;
	
	LibraryBook(){
		title="How to be Alone";
		author="Varma";
		price=450;
		availability=true;
	}
	LibraryBook(String title, String author, int price, boolean availability){
		this.title=title;
		this.author=author;
		this.availability=availability;
		this.price=price;
	}
	LibraryBook(LibraryBook copy){
		this.title=copy.title;
		this.author=copy.author;
		this.availability=copy.availability;
		this.price=copy.price;
	}
	void Borrow(){
		if(availability){
			System.out.println("You are Successfully Borrowed Book: "+title);
			availability=false;
		}
		else{
			System.out.println("The Book is Unavailable");
		}
	}
	boolean isavailable(){
		return availability;
	}
	void display(){
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
		System.out.println("Availability: "+availability);
	}
	public static void main(String[] args){
		LibraryBook one =new LibraryBook();
		LibraryBook two = new LibraryBook("How to Become Good","Captain",320,true);
		LibraryBook three = new LibraryBook(one);
		one.display();
		two.display();
		three.display();
		one.Borrow();
		one.Borrow();
		
	}
}
		
