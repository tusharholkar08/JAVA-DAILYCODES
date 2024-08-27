import java.util.*;

class prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");

        int size = sc.nextInt();
        System.out.println("Enter elements:");

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
	if(size%2==1){
		for (int j = 0; j < arr.length; j++) {
			System.out.println( " Array elements are : " + arr[j]);
		}
	}else{
		for (int k = 0;  k < arr.length; k++) {
			if(k%2==1){
				System.out.println( " Array elements are : " + arr[k]);

			}
		}
	}
    }
}
