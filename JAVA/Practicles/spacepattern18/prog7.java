import java.util.*;

class prog7{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter rows : ");
                int row = sc.nextInt();
                
                for(int i = 1; i <= row; i++){
                        for(int sp = 1; sp < i;sp++){
                        System.out.print(" ");
                }
                        for(int j = 1;j <=row-i+1;j++){
                        System.out.print(j);
                }
                
                System.out.println();
                }
        }
}
