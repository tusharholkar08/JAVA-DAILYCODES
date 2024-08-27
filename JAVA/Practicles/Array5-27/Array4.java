import java.util.*;
class Array4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements of array: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
	
		int flag = 0;
		for(int i = 0; i < size; i++){
			for(int j = i+1; j < size; j++){
				if(arr[i] == arr[j]){
					System.out.println("First duplicate elemnet occurs at index " + i);
					flag = 1;
					break;
				}
			}
			if(flag == 1){
				break;
			}
		}
		
		if(flag == 0){
			System.out.println("No duplicate element found in the array");
		}
	}
}
