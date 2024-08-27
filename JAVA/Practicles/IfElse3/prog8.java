class prog8{
	public static void main(String[]args){
		float percent = 91.00f;
		if(percent <= 100 && percent >90){
			System.out.println("First Class");
		}
		else if(percent <= 90 && percent >80){
                        System.out.println("Second Class");
		}
		else if(percent <= 80 && percent >=35){
                        System.out.println("Pass");
		}
		else{
                        System.out.println("First Class");
		}
	}
}
