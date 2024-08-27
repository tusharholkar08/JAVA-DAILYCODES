import java.util.*;


class prog4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int row = sc.nextInt();

		for(int i = 1; i <= row; i++){
			int x = row;
			for(int sp = row; sp > i; sp--){
			i
				System.out.print(" ");
			}
			for(int j = 1; j <= i ; j++){
				System.out.print(x * j);
				
			}
			System.out.println();
		}
	}
}
