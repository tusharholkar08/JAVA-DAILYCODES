class prog1{
	public static void main(String[] args){
		int x = 10;
		int y = 20;
		int z = 30;
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
	}
}
