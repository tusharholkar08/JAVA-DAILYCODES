import java.util.*;
class prog3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are : ");
		for(int j = 0;j<arr.length;j++){
			if(j%2==1){
			    System.out.println(arr[j]);
			}
		}
	}
}

