class prog8{
	public static void main(String[]args){
		int x = 216985;
		int z = 1;
		while(x > 0){
			z = x%10;
			x/=10;
			if(z%2==1){
				System.out.println(z);
			}
		}
	}
}
