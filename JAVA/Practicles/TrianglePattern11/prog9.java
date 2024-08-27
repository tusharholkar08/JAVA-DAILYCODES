import java.io.*;
class prog9{
        public static void main(String[]args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter rows : ");
                int rows = Integer.parseInt(br.readLine());
                
                for(int i = 1; i<=rows; i++){
			char ch = 'D';

                        for(int j=i; j<=rows; j++){
                                System.out.print(ch + " ");
				ch--;

                        }
                        
                        System.out.println( );
                }
        }
}
