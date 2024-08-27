class prog10{
	public static void main(String[]args){
		long x = 9307922405L;
		long sum = 0L;
		long z = 0L;
		while(x>0){
			z = x%10;
			x/=10;
			sum = sum + z;
		}
		System.out.println(sum);
	}
}
