class prog4{
	public static void main(String[]args){
		float percentage = 85.00f;
		if(percentage > 85.00){
			System.out.println("Medical");
		}
		else if(percentage <= 85.00 && percentage >75.00){
				System.out.println("Engineering");
		}
		else if(percentage <= 75.00 && percentage >=65.00){
			System.out.println("Pharmacy or BCA");
		}
		else{
			System.out.println("Art and MPSC UPSC");
		}
	}
}
