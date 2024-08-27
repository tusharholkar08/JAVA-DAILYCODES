import java.util.*;
class prog10{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a rows : ");
                int rows = sc.nextInt();
		int ch = rows+64;
		int num = rows+98;

                for(int i=1; i<=rows; i++){
                        

                        for(int j=rows; j>=i; j--){
                                if(i%2==0){

                                System.out.print((char)num +" ");
                                num--;
                                }
                                else{
                                        System.out.print((char)ch +" ");
					ch--;

                                        
                                }
                        }
			ch+=2;
			num+=2;
                         System.out.println();
                }
        }
}
