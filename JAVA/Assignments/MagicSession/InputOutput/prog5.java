import java.util.*;

class prog5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int x = sc.nextInt();
		if(x%16==0){
			System.out.println(x +" is present in table of 16");
		}
		else{
			System.out.println(x +" is not present in table of 16");
		}
	}
}
