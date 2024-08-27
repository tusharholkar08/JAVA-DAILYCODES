import java.util.*;

class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter elements: ");
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
	int x =1;
	int sn = sc.nextInt();
	for(int j = 0;j<arr.length;j++){
		i
               if(arr[j]==sn){
		System.out.println(arr[j] + " occured " + x++);
		break;
	       }else{
		       System.out.println(sn + " not found " );
	       }
	}
    }
}

