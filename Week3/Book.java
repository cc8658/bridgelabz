class Book{
	String title;
	String author;
	int price;
	Book(){
		title = "Best Medicine To Recover";
		author = " Varma";
		price = 250;
	}
	Book(String title, String author, int price){
		this.title = title;
		this.author= author;
		this.price= price;
	}
	void displayoutput(){
		System.out.println("\nTitle name is: "+title);
		System.out.println("Author of Book is: "+author);
		System.out.println("Price of the Book is: "+price);
	}
	public static void main(String[] args){
		Book one = new Book();
		Book two= new Book("How are oyj","john",450);
		one.displayoutput();
		two.displayoutput();
	}
}