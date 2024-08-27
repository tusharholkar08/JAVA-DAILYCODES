import java.util.*;

class prog4{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Rows : ");
                int row = sc.nextInt();
		int num = row;

                for(int i = 1; i <= row; i++){
			int x = 64+num;
                        for(int j = 1; j <= row; j++){
                                if(j==1){
                                        System.out.print((char)x+" ");
					num++;
                                }else{
                                        System.out.print(num+" ");
					num++;
                                }
                        }
                        System.out.println();
                }
        }
}
