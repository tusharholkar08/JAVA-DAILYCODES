import java.io.*;
class prog9{
        public static void main(String[]args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter rows : ");
                int rows = Integer.parseInt(br.readLine());
                char ch = 'a';

                for(int i=1; i<=rows; i++){
			int num = rows+1;

                        for(int j=1; j<=i; j++){
                                if(j%2==0){
                                System.out.print(ch +" " );
                                ch++;
				num++;
                                }
                                else{
                                        System.out.print(num +" ");
                                        num++;
                                }



                        }
                         System.out.println( );
                }
        }
}
