import java.util.*;
class prog1{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.print("enter row :");
                int row = sc.nextInt();
		int num = 1;
                for(int i=1; i<=row; i++){
                        
                        for(int sp=row; sp>i; sp--){
                                System.out.print("\t");
                        }
                        for(int j=1; j<=i; j++){
				
				
					System.out.print(num +"\t");
					num+=2;
                        }
		
                        System.out.println();
                }
        }
}



