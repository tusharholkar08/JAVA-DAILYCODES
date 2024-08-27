import java.util.*;

class prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");

        int size = sc.nextInt();
        System.out.println("Enter elements:");

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int prod = 1;
        for (int j = 0; j < arr.length; j++) {
            if (j % 2 != 0) {
                prod *= arr[j];
            }
        }
        System.out.println("Product of odd indexed elements: " + prod);
    }
}
