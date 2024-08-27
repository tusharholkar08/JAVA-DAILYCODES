import java.util.*;

class prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        System.out.println("Enter element :");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int maxPos = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                maxPos = j;
            }
        }
        System.out.println("Maximum number in the array is found at position " + maxPos + " and is " + max);
    }
}
