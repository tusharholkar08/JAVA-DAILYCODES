import java.util.*;
class prog4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row : ");
		int row = sc.nextInt();

		int num = row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2==0){
					if(j%2==0){
						System.out.print("$" + " ");
					}else{
						System.out.print("&"+ " ");
					}
				}else{
					System.out.print("&"+ " ");
				}
			}
			System.out.println();
		}
	}
}
