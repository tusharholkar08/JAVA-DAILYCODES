import java.util.*;

class prog1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row : ");
		int row = sc.nextInt();

		for(int i = 1; i <= row; i++){
			for(int j = 1; j <= row; j++){
				System.out.print("$# ");
			}
			System.out.println();
		}
	}
}

