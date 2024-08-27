class prog3{
	public static void main(String[]args){
		//to check the value is even or odd and greater than 10

		//int num = 13;
		//int num = 8;
		int num = 10;
		if(num %2==1 && num > 10){
			System.out.println("num is odd and greater than 10");
		}
		else if( num %2==0 && num < 10){
			System.out.println("num is even and less than 10");
		}
		else{
			System.out.println("num is 10 and 10 is even");
		}

	}
}	
