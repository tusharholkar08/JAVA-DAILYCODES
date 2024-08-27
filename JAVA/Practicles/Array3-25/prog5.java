import java.util.*;

class prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");

        int size = sc.nextInt();
        System.out.println("Enter elements: ");
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int j = 0;j<arr.length;j++){
                if(arr[j]<0){
			arr[j] = arr[j]*arr[j];
			System.out.println( "Square is : " + arr[j]);
		}else{
			System.out.println( "Square is : " + arr[j]);
		}
	}
    }
}
