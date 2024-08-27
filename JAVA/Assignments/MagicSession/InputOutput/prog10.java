import java.util.*;

class prog10{
        public static void main(String[]args){
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter math :");
                int x1 = sc.nextInt();

                System.out.println("Enter English :");
                int x2 = sc.nextInt();
                
		System.out.println("Enter Science :");
                int x3 = sc.nextInt();

		System.out.println("Enter Marathi :");
                int x4 = sc.nextInt();

		if(x1 <100 && x2 <100 && x3<100 && x4<100){
			System.out.println(x1 + x2 + x3 + x4);
		}
		else{
			System.out.println("Invalid Marks");
		}
        }
}
