import java.io.*;
class prog6{
        public static void main(String[]args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter rows : ");
                int rows = Integer.parseInt(br.readLine());
                char ch = 'A';
                for(int i=1; i<=rows; i++){
			int num = 1;

                        for(int j=1; j<=i; j++){
				if(i%2==0){
                                System.out.print(ch +" " );
                                ch++;
				}
				else{
					System.out.print(num +" ");
					num++;
					ch++;
				}



                        }
                         System.out.println( );
                }
        }
}
