import java.util.*;

class prog4 {
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
		if(arr[j]%2==0){
			arr[j]=0;
			System.out.println(  "Number is" + arr[j]);
		}else{
			arr[j]=1;
			System.out.println( "Number is" + arr[j]);
		}
	}
    }
}
