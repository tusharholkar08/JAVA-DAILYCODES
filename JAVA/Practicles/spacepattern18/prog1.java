import java.util.*;
class prog1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row :");
		int row = sc.nextInt();
                
		for (int i =1;i<=row;i++){
			int num =1;
			for(int sp=row;sp>i;sp--){
				System.out.print(" ");
			}
			for(int j =1;j<=i;j++){
				System.out.print(num);
				num++;
			}
		
		System.out.println();
		}
	}
}
