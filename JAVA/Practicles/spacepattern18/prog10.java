import java.util.*;

class prog10{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter rows : ");
                int row = sc.nextInt();

                for(int i = 1; i <= row; i++){
                        int x =64+i;
                        for(int sp = 1; sp < i;sp++){
                        System.out.print(" ");
                }
                        for(int j = 1;j <=row-i+1;j++){
				if(j%2==1){
					System.out.print(x);
					x++;
				}else{
					System.out.print((char)x);
					x++;
				}
                }
                System.out.println();
                }
        }
}
