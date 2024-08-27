class prog4{
	public static void main(String[]args){
		int number = 301071;

		int numval = 0;
		int temp = number;
		while(temp!=0){
			numval = numval*10+(temp%10);
			temp/=10;

		}
		System.out.println(temp);
		System.out.println(numval);
		System.out.println(number);
	}
}
