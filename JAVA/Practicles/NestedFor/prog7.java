class prog7{
	public static void main(String[]args){
		int row = 4;
		for(int i = 1; i <=row; i++){
			int ch = 96 + row;
			for(int j = 1; j <=row; j++){
				System.out.print((char)ch + " ");
				ch--;
			}
			System.out.println();
		}
	}
}
