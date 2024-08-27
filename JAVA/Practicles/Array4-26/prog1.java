import java.util.*;
class prog1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			System.out.println("enter element ");
			arr[i]= sc.nextInt();
		}
		System.out.println("array is :  ");
		for(int i=0; i<arr.length; i++){
			sum = sum + arr[i];
		}
		
		sum = sum/arr.length;
		System.out.println("array elements average: " +sum );
	}

}





