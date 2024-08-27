import java.util.*;

class prog9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();

		int x = 62+row;
		for(int i =1;i<=row;i++){
			int num =1;
			for(int j =row;j>=i;j--){
				if(i%2==0){
					System.out.print((char)x);
					x--;
				}else{
					System.out.print(num);
					num++;
				}
			}
			x++;
                        System.out.println();
		}
	}
}

