import java.io.*;
class prog4{
        public static void main(String[]args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter rows : ");
                int rows = Integer.parseInt(br.readLine());
                for(int i=1; i<=rows; i++){
                        char ch ='c';
			char val = 'C';
                        for(int j=1; j<=i; j++){
                                if(i%2==0){

                                 System.out.print(ch +" ");
				 ch--;
                                }
                                else{
                                        System.out.print(val +" ");
                                        val--;
                                }


                        }
                         System.out.println( );
                }
        }
}
