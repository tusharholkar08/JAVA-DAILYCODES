import java.io.*;
class Array5{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the size of array: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter the elements of array: ");
		for(int i = 0; i < size; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int i = 0; i < size; i++){
			int digit = 0;
			while(arr[i] > 0){
				arr[i] /= 10;
				digit++;
			}

			System.out.print(digit + ", ");
		}
	}
}
