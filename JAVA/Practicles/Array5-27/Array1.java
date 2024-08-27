import java.io.*;
class Array1{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the size of array: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int flag = 0;
		for(int i = 1; i < size; i++){
			if(arr[i] < arr[i-1]){
				flag = 1;
			}
		}

		if(flag == 0){
			System.out.println("The given array is in ascending order.");
		}else{
			System.out.println("The given array is not in ascending order.");
		}
	}
}
