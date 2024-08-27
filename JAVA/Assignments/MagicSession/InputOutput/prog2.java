import java.util.*;

class prog2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		if(age >= 18){
			System.out.println("Eligible for voting");
		}
		else{
			System.out.println("not eligible for voting");
		}
	}
}

