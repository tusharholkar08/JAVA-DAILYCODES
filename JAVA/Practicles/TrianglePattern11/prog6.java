import java.io.*;
class prog6{
        public static void main(String[]args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter rows : ");
                int rows = Integer.parseInt(br.readLine());
		int num =  3;
                for(int i = 1; i<=rows; i++){
                        
                        for(int j=rows; j>=i; j--){
                                System.out.print(num+ " ");
                                
                        }
			num--;
                        System.out.println( );
                }
        }
}
