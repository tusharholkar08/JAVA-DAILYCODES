import java.io.*;
class Array9{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the number: ");
		int num = Integer.parseInt(br.readLine());
		
		int temp = num;
		int size = 0;
		
		while(temp != 0){
			temp /= 10;
			size++;
		}
			
		int arr[] = new int[size];

		int i = size-1;
		while(num != 0){
			int rem = num % 10;
			rem += 1;
			arr[i] = rem;
			num /= 10;
			i--;
		}

		for(int j = 0; j < size; j++){
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}
}
