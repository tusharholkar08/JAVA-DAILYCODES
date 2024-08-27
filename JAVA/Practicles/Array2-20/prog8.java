import java.util.*;

class prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        System.out.println("Enter elements:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 5 && arr[j] < 9) {
                System.out.println(arr[j] + " is greater than 5 but less than 9");
            }
        }
    }
}
