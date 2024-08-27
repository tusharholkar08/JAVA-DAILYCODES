import java.util.*;
class prog4{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a rows : ");
                int rows = sc.nextInt();
		int  ch = rows+68;
                for(int i=1; i<=rows; i++){
                        
                        for(int j=rows; j>=i; j--){
                                System.out.print((char)(char)(char)(char)(char)(char)(char)(char)(char)ch +" ");
				ch--;
                        }
                         System.out.println();
                }
        }
}
