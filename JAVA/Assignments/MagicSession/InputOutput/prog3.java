import java.util.*;

class prog3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int x = sc.nextInt();
		if(x%8==0){
			System.out.println("Divisible by 8 : "+ x);
		}
		else{
			System.out.println("not Divisible by 8 :"+ x);
		}
	}
}
