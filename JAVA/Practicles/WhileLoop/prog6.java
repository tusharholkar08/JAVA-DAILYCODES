class prog6{
	public static void main(String[]args){
		int num = 9307;
		int rem = 0;
		while(num > 0){
			rem = num%10;
			num/=10;
			System.out.println(rem);
		}
	}
}
