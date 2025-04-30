class Product{
	String productName;
	double price;
	static int totalproducts;
	
	
	Product(String productName, double price){
		this.productName=productName;
		this.price=price;
		totalproducts++;
	}
	
	void displayProductDetails(){
		System.out.println("Product Name: "+productName);
		System.out.println("Product Price: "+price);
		
	}
	
	static void displayTotalProducts(){
		System.out.println("Total Products: "+totalproducts);
	}
	
	public static void main(String[] args){
		Product one=new Product("mobile",12000);
		Product two=new Product("charger",2000);
		Product three=new Product("cable",1000);
		one.displayProductDetails();
		two.displayProductDetails();
		three.displayProductDetails();
		Product.displayTotalProducts();
	}
}

		
		
		
	