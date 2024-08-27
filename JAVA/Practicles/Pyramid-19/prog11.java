import java.util.*;
class prog11{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter rows :");

                int rows = sc.nextInt();
                int ch = 68;
                for(int i = 1;i<=rows;i++){
                        
                        for(int sp=rows;sp>=i;sp--){
                                System.out.print("\t");
                        }
                        for(int j=1;j<=i*2-1;j++){
                                if(j<i){
                                System.out.print((char)ch + "\t");
                                
                                ch++;
                               
				}else{
                                        System.out.print((char)ch +"\t");
                                     
					ch--;
                                }

                        }
                  System.out.println();
                }
        }
}
