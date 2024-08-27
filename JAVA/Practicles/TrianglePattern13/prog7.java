import java.util.*;
class prog7{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a rows : ");
                int rows = sc.nextInt();
		int ch = rows+64;
		int num = rows;

                for(int i=1; i<=rows; i++){
                        

                        for(int j=rows; j>=i; j--){
                                if(j%2==0){

                                System.out.print((char)ch +" ");
                                ch--;
				

                                }
                                else{
                                        System.out.print(num +" ");
                                        
                                }
                        }
                         System.out.println();
                }
        }
}
