import java.util.*;

class prog8{
        public static void main(String[]args){
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter x1 :");
                int x1 = sc.nextInt();

                System.out.println("Enter x2 :");
		int x2 = sc.nextInt();
		int sum = 0;
		for (int i = x1; i <= x2; i++){
			sum = sum + i;
		}
		System.out.println(sum);
        }
}
