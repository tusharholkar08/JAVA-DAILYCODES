import java.util.*;

class prog10{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Rows : ");
                int row = sc.nextInt();

                for(int i = 1; i <= row; i++){
			int num = row;
			int x = 64 + row;
                        for(int j = 1; j <= row; j++){
                                if(i%2==1){
                                        if(j%2==1){
                                                System.out.print(num-- +" ");
						x--;
                                        }else{
                                                System.out.print((char)x-- +" ");
						num--;
                                        }
                                }else{
                                       System.out.print((char)x-- +" ");
                                }
                        }
                        System.out.println();
                }
        }
}
