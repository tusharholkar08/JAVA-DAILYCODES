import java.util.*;

class prog6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x :");
		int x = sc.nextInt();

		System.out.println("Enter y :");
		int y = sc.nextInt();
		for(int i = x; x <= y; i++){
			System.out.println(x);
			x++;
		}
	}
}

