import java.util.*;

class prog1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x%2==0){
			System.out.println("Even :" + x);
		}else{
			System.out.println("Odd :" + x);
		}
	}
}

