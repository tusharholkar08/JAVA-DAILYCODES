import java.util.*;
class prog8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int row = sc.nextInt();

		int num = row;
		for(int i = 1;i<=row;i++){
			for(int j = 1; j<=row; j++){
				if(i%2==1){
					if(j%2==1){
						System.out.print(num*num-1 + " ");
						num++;
					}else{
						System.out.print((char)(97 + num) + " ");
						num++;
					}
				}else{
					System.out.print((char)(97 + num) + " ");
					num++;
				}
			}
			System.out.println();
		}
	}
}
