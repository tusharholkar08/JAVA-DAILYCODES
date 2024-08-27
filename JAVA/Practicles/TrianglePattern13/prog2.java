import java.util.*;
class prog2{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a rows : ");
                int rows = sc.nextInt();
		int num  = 2;
                for(int i=1; i<=rows; i++){
                        
                        for(int j=rows; j>=i; j--){
                                System.out.print(num +" ");
				num+=2;
                        }
                         System.out.println();
                }
        }
}
