import java.io.*;
class prog7{
        public static void main(String[]args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter rows : ");
                int rows = Integer.parseInt(br.readLine());
                char ch = 'a';
                for(int i=1; i<=rows; i++){

                        for(int j=1; j<=i; j++){
				if(j%2==0){
                                System.out.print(ch +" " );
                                ch++;
				}
				else{
					System.out.print(i +" " );
				}


                        }
                         System.out.println( );
                }
        }
}
