import java.util.*;
class prog8{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter rows :");

                int rows = sc.nextInt();
	         
		int num =1;
		char ch = 'A';

                for(int i = 1;i<=rows;i++){
                        for(int sp=rows;sp>=i;sp--){
                                System.out.print("\t");
                        }
                        for(int j=1;j<=i*2-1;j++){
                                if(i%2==1){
                                System.out.print(num + "\t");
				
                                }else{
                                        System.out.print(ch +"\t");
                                }
                        }
			num++;
			ch++;
                  System.out.println();
                }
        }
}
