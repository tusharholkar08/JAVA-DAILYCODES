class prog4{
	public static void main(String[]args){
		int x = 1;
		int z = 6;
		char ch = 'A';
		while(x <= z){
			if(x%2==0){
				System.out.println(x);
			}else{
				System.out.println(ch);
			}

			ch++;
			x++;
		}
	}
}
