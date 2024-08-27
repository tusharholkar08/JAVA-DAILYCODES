import java.util.*;
class prog10{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter rows :");

                int rows = sc.nextInt();

		char ch1 = 'A';
                char ch2='a';

                for(int i = 1;i<=rows;i++){
                        for(int sp=rows;sp>=i;sp--){
                                System.out.print("\t");
                        }
                        for(int j=1;j<=i*2-1;j++){
                                if(i%2==1){
                                System.out.print(ch1 + "\t");
				ch1++;
                                
                                }else{
                                        System.out.print(ch2 +"\t");
					ch2++;
					
                                }
                        }
			ch1--;
			ch2--;
                  System.out.println();
                }
        }
}
