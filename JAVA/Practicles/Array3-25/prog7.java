import java.util.*;

class prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter elements: ");
        char arr[] = new char[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        for (int j = 0; j < arr.length; j++) {
            if ((j + 1) % 2 == 1 && size >= 5) {
                System.out.println(arr[j]);
            }
        }
    }
}
