import java.util.*;

class prog4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int x = sc.nextInt();

		int num = 1;
		for(int i = 1; i <= 10; i++){
			num = x * i;
			System.out.println(num);
		}
	}
}
