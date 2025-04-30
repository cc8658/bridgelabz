class Product{
	private static double discount;
	private String productName;
	private double price;
	private int quantity;
	private final String productID;
	
	Product(String productName,double price,int quantity,String productID){
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
		this.productID=productID;
	}
	
	static void setDiscount(double price){
		discount=price;
	}
	static void updateDiscount(){
		System.out.println("Discount of the products: "+discount);
	}
	void displayResult(Object ob){
		if(ob instanceof Product){
			System.out.println("Product Name: "+productName);
			System.out.println("Product Price: "+price);
			System.out.println("Product Quantity: "+quantity);
			System.out.println("Product ID: "+productID);
		}
		else{
			System.out.println("The object is not in the class");
		}
			
	}
	public static void main(String[] args){
		Product.setDiscount(12.5);
		Product.updateDiscount();
		Product one = new Product("Fruits",216.5,5,"AC1243");
		one.displayResult(one);
		
		String two="one of two";
		one.displayResult(two);
	}
}