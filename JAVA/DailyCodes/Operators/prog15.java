class prog15{
	public static void main(String[]args){
		int x = 10;
		int y = 11;
		System.out.println((++x>=y) && (x<++y)); //true
		System.out.println(x); //11
		System.out.println(y); //12
	}
}
