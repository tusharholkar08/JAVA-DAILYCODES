import java.util.*;
class prog3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter row : " );
		int row = sc.nextInt();
		for(int i=1;i<=row;i++){
			int ch = row+64;
			for(int j =1;j<=row;j++){
				if(i%2==0){
					System.out.print(j + " ");
					
				}else{
					System.out.print((char)ch + " ");
				         ch--;
				}
			}
			System.out.println();
		}
	}
}

