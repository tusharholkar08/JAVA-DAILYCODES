import java.util.*;
class prog4{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.print("enter row :");
                int row = sc.nextInt();
		
		

                for(int i=1; i<=row; i++){
			int x = 64+i;
			int y = 96+i;

                        for(int sp=1; sp<i; sp++){
                                System.out.print("\t");
                        }

                        for(int j=1; j<=row-i+1; j++){
				if(row%2==1){

                               System.out.print( (char)x +"\t");
                                x++;
				}
				else{
					System.out.print((char)y +"\t");
					y++;
				}
                        }
                        System.out.println(" ");
		
                }
        }
}
