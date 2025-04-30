class SampleProgram2{
	public static void main(String[] args){
		int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
		int length = ages.length;
		for (int i=0;i<length;i++){
			System.out.print(ages[i]+" ");
		}
		int lowestAge = ages[0];
		for (int age : ages) {
			if (lowestAge > age) {
				lowestAge = age;
			}
		}
		System.out.println("\nThe lowest age in the array is: " + lowestAge);
	}
}
