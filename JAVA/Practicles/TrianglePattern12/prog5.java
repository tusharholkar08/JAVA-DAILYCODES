import java.io.*;
class prog5{
        public static void main(String[]args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter rows : ");
                int rows = Integer.parseInt(br.readLine());
		char ch = 'E';
                for(int i=1; i<=rows; i++){
                        
                        for(int j=1; j<=i; j++){
                                System.out.print(ch +" " );
				ch++;


                        }
                         System.out.println( );
                }
        }
}
