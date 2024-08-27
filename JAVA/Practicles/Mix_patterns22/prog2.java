import java.util.*;
class prog2{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.print("enter row :");
                int row = sc.nextInt();
		
                for(int i=1; i<=row; i++){
			for(int sp=1; sp<i; sp++){
				System.out.print("\t");
			}
			
			for(int j=1; j<=row-i+1; j++){
				int num = j;

				System.out.print( num +"\t");
				num++;
			}
			System.out.println(" ");
		}
	}
}



