import java.util.*;

class prog6{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Rows : ");
                int row = sc.nextInt();
                int num = row;

                for(int i = 1; i <= row; i++){
                        for(int j = 1; j <= row; j++){
                                if(num%2==1){
                                        System.out.print(num * num +" ");
                                        num++;
                                }else{
                                        System.out.print(num +" ");
                                        num++;
                                }
                        }
                        System.out.println();
                }
        }
}
