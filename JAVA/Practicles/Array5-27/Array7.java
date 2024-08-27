import java.io.*;
class Array7{
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
                        int fact = 0;
                        for(int j = 1; j <= arr[i]/2; j++){
                                if(arr[i] % j == 0){
                                        fact++;
                                }
                        }

			if(fact > 1){
				System.out.print(arr[i] + " ");
			}
                }

		System.out.println();

	}
}
