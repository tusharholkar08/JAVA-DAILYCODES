import java.util.*;
class prog3{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter row :");
                int row = sc.nextInt();

                for (int i =row;i>=1;i--){
                        int x=64+i;
                        for(int sp = i; sp >1; sp--){
                                System.out.print(" ");
                        }
                        for(int j =row;j>=i;j--){
                                System.out.print((char)x);
                                x++;
                        }

                System.out.println();
                }
        }
}
