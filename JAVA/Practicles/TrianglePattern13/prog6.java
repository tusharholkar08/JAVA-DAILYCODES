import java.util.*;
class prog6{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a rows : ");
                int rows = sc.nextInt();

                for(int i=1; i<=rows; i++){
                        int ch = 1;
                        char x = 'a';

                        for(int j=rows; j>=i; j--){
                                if(j%2==0){

                                System.out.print(ch +" ");
                                ch++;
                                }
                                else{
                                        System.out.print(x +" ");
                                        x++;
                                }
                        }
                         System.out.println();
                }
        }
}
