import java.util.*;

class prog9{
        public static void main(String[]args){
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter x1 :");
                int x1 = sc.nextInt();

                System.out.println("Enter x2 :");
                int x2 = sc.nextInt();
                
                for (int i = x1; i <= x2; i++){
			if(i%2==0){
				System.out.println(i);
			}
                }
        }
}
