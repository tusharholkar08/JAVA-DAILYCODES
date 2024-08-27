import java.util.*;
class prog6{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter rows :");

                int rows = sc.nextInt();
                
                for(int i = 1;i<=rows;i++){
                        int num =1;
                        for(int sp=rows;sp>=i;sp--){
                                System.out.print("\t");
                        }
                        for(int j=1;j<=i*2-1;j++){
				if(j<i){
                                System.out.print(num + "\t");
				num++;
				}else{
					System.out.print(num +"\t");
					num--;
				}

			}
                  System.out.println();
                }
        }
}
