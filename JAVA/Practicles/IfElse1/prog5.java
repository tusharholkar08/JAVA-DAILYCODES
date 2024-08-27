clss prog5{
	public static void main(String[]args){
		char ch = 'a';
		System.out.println(ch = ch+8);
		if(ch=='a'){
			int X = 5;
			System.out.println(ch-- + X);
		}
		else{
			int X = 7;
			System.out.println(ch++);
			System.out.println(X);
		}
		System.out.println(ch+=5);
	}
}
