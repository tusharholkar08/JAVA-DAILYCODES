class prog7{
	public static void main(String[]args){
		int x = 93079224;
		int count = 0;
		while(x > 0){
			x/=10;
			count++;
		}
		System.out.println(count);;
	}
}
