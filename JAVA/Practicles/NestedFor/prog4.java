class prog4{
	public static void main(String[]args){
		char x = 'A';
		for(int i = 1; i<=3; i++){
			for(int j = 1; j<= 3; j++){
				if(x%2==1){
					System.out.print(x + " ");
				}
				x+=2;
			}
			System.out.println();
		}
	}
}
