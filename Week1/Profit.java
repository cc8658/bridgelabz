class Profit{
	public static void main(String[] args){
		int cp=129;
		int sp=191;
		int profit=sp-cp;
		float percentage=(profit*100)/cp;
		System.out.printf("The Cost Price is INR "+cp+
		" and Selling Price is INR "+sp+"\nThe Profit is INR "
		+profit+" and the Profit Percentage is "
		+"%.2f",percentage);
	}
}