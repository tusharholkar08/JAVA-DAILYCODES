import java.util.*;
class prog1{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
			System.out.println("Enter row : ");
			int row =sc.nextInt();

			int num =row;
			for(int i =1; i<=row;i++){
				for(int j =1; j<=row;j++){
					if(j==1){
						System.out.print((char)(64 +num));
						num++;
					}else{
						System.out.print((char)(96 +num));
						num++;
					}
				}
				System.out.println();
			}
		}
	}
