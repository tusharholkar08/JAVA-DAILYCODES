class prog9{
	public static void main(String[]args){
		int x = 214367689;
		int odd = 0;
		int even = 0;
		int z = 0;
		while(x>0){
			z = x%10;
			x/=10;
			if(z%2==1){
				odd++;
			}else{
				even++;
			}
		}
		System.out.println(odd);
		System.out.println(even);
	}
}

