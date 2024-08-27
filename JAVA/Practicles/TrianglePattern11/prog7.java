import java.io.*;
class prog7{
        public static void main(String[]args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter rows : ");
                int rows = Integer.parseInt(br.readLine());
                
                for(int i = 1; i<=rows; i++){
			int num = 1;

                        for(int j=rows; j>=i; j--){
                                System.out.print(num+ " ");
				num++;

                        }
                        num--;
                        System.out.println( );
                }
        }
}
