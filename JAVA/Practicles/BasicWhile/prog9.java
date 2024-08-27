class prog9{
	public static void main(String[]args){
		int i = 150;
		int x = 0;
		while(i >= 101){
			if(i%2==1){
				x = x + i;
			}
			i--;
		}
		System.out.println(x);
	}
}
