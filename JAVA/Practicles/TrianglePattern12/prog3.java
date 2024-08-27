import java.io.*;
class prog3{
        public static void main(String[]args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter rows : ");
                int rows = Integer.parseInt(br.readLine());
                for(int i=1; i<=rows; i++){
                        char ch ='C';
                        for(int j=1; j<=i; j++){
                               
                                        System.out.print(ch +" ");
                                        ch--;
                                


                        }
                         System.out.println( );
                }
        }
}
