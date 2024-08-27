import java.util.*;
class prog2{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter rows : ");
		int row = sc.nextInt();

		int num = row;
		for(int i = 1;i<=row;i++){
			for(int j = row;j>1;j--){
				System.out.print((char)(96 + num));
				num++;
			}
			for(int k=1;k<=1;k++){
				System.out.print((char)(64 + num));
                                num++;
			}			
		System.out.println();
		}
	}
}
