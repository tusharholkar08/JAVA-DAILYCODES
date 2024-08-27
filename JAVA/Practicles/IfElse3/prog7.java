class prog7{
	public static void main(String[]args){
		int sell = 900;  
		int cost = 900;
		int prof = sell - cost; //calculate profit
		int loss = cost - sell; //calculate loss

		if(sell > cost){
			System.out.println("profit:" +prof);
		}
		else if(sell < cost){
			System.out.println("loss:"+loss);
		}
		else{
			System.out.println("No profit no loss");
		}
	}
}	

