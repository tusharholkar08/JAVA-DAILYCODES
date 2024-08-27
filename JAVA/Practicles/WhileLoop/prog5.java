class prog5{
	public static void main(String[]args){
		int i = 1;
		int z = 1;
		while(i <= 4){
			int j = 1;
			while(j <= 4){
				System.out.print(z + " ");
				z+=2;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
