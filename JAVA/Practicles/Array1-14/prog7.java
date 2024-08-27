import java.util.*;

class prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
	for(int i = 0;i<arr.length;i++){
		arr[i] = sc.nextInt();
	}
	for(int j =0;j<arr.length;j++){
		if(arr[j]%4==0){
			System.out.println(arr[j] + "is divisible by 4 and its index is " + j);
		}
	}
    }
}
