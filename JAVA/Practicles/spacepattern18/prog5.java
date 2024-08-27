import java.util.*;

class prog5{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter rows : ");
                int row = sc.nextInt();

                for(int i = 1; i <= row; i++){
			for(int sp=row;sp>i;sp--){
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++){
			System.out.print(i*j);
		}
		System.out.println();
		}
	}
}
