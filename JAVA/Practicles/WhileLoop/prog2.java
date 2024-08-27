class prog2{
	public static void main(String[]args){
		int x = 150;
		int z = 1;
		while(x <= 198){
			z = x*x;
			if(z%2==1){
				System.out.println(x);
			}
			x++;
		}
	}
}
