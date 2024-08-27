import java.util.*;

class prog8{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Rows : ");
                int row = sc.nextInt();
                int num = row;

                for(int i = 1; i <= row; i++){
			int ch = 63+row;
                        for(int j = 1; j <= row; j++){
                                if(j%2==1){
                                        System.out.print("#"+" ");
                                        num++;
                                }else{
                                        System.out.print((char)ch-- +" ");
                                        num++;
                                }
                        }
                        System.out.println();
                }
        }
}
