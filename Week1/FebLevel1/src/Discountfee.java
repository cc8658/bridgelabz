class Discountfee{
    public static void main(String[] args){
        int fee=125000;
        int discountpercent=10;
        int discount=(fee*discountpercent)/100;
        int discountfee=fee-discount;
        System.out.print("The discount amount is INR "+discount+" and final discounted fee is INR "+discountfee);
    }
}