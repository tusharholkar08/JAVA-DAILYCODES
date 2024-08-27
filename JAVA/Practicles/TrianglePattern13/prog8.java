import java.util.*;
class prog8{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a rows : ");
		int rows = sc.nextInt();
		int ch = rows+63;
		 int num = j;
		for(int i=1; i<rows; i++){
			for(int j=rows; j>=i; j--){
				if(i%2==0){
					System.out.print((char)ch +" ");
					ch--;
				}
				else
				{
					
					System.out.print(num +" ");
					num--;
				}
			
			}
			ch+=1;
			num+=1;

			System.out.println();
		}
	}
}
