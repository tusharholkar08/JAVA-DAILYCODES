import java.util.*;

class prog5{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Rows : ");
                int row = sc.nextInt();

                for(int i = 1; i <= row; i++){
                        int x = i;
                        for(int j = 1; j <= i; j++){
                                System.out.print(x);
                                x = x * i;
                        }
                        System.out.println();
                }
        }
}
