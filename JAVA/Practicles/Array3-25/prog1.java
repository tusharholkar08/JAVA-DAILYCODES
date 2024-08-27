import java.util.*;

class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter elememt : ");
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            arr[j] = arr[j] + 15;
            System.out.println( " Addition is : " + arr[j]);
        }
    }
}

