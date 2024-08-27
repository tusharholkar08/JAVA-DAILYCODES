import java.util.*;

class prog7{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter x :");
		int x = sc.nextInt();
		
		for(int i = 10; i >= 1; i--){
			
			System.out.println(x*i);
		}
	}
}
