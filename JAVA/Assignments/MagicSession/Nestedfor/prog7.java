import java.util.*;


class prog7{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row : ");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++){
			int ch = row + 96;

			for (int j = 1; j <= row; j++){
				System.out.print((char)ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
