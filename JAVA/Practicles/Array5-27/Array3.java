import java.io.*;
class Array3{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the size of array: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter the elements of array: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
	
		int flag = 0;
		for(int i = 0; i < size; i++){
			if(arr[i] != arr[size-1-i]){
				flag = 1;
			}
		}

		if(flag == 0){
			System.out.println("The given array is palindrome.");
		}else{
			System.out.println("The given array isn't palindrome.");
		}
	}
}
