import java.util.*;
class prog3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row : ");
		int row = sc.nextInt();

		int num = row;
		for(int i = 1;i<=row;i++){
			for(int j = 1;j<=row;j++){
				if(row%2==1){
					if(num%2==1){
						System.out.print((char)(96 + num ) + " " );
						num++;
					}else{
						System.out.print(num + " ");
						num++;
					}
				}else{
					if(num%2==1){
                                                System.out.print(num +  " ");
                                                num++;
                                        }else{
                                                System.out.print((char)(96 + num) + "  ");
                                                num++;
                                        }
				}
			}
			System.out.println();
		}
	}
}
