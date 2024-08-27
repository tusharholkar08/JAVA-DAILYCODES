import java.util.*;
class Array6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements of array: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
	
		for(int i = 0; i < size; i++){
			int fact = 0;
			for(int j = 1; j <= arr[i]/2; j++){
				if(arr[i] % j == 0){
					fact++;
				}
			}

			if(fact == 1){
				System.out.println("First prime number found at index " + i);
				break;
			}
		}
	}
}
