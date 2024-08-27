import java.io.*;
class prog4{
        public static void main(String[]args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter rows : ");
                int rows = Integer.parseInt(br.readLine());
                for(int i = 0; i<=rows; i++){
                        int num = 3;
                        for(int j=1; j<=i; j++){
                                System.out.print(num*j + " ");
                                
                        }
                        System.out.println( );
                }
        }
}
