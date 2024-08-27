import java.util.*;

class prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter elements: ");
        char arr[] = new char[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }
        
        System.out.println("Consonants in the array:");
        for (int j = 0; j < arr.length; j++) {
            if (!(arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u')) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}

