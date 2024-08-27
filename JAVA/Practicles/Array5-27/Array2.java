import java.util.*;
class Array2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements of array: ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}

		int oS = 0;
		int eS = 0;
		for(int i = 0; i < size; i++){
			if(arr[i] % 2 == 0){
				eS += arr[i];
			}else{
				oS += arr[i];
			}
		}

		System.out.println("Odd Sum = " + oS);
		System.out.println("Even Sum = " + eS);
	}
}
