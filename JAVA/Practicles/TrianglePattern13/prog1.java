import java.util.*;
class prog1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a rows : ");
		int rows = sc.nextInt();
		for(int i=1; i<=rows; i++){
			int num = i;
			for(int j=rows; j>=i; j--){
				System.out.print(num++ +" ");
			}
			 System.out.println();
		}
	}
}
