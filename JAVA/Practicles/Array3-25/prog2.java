import java.util.*;

class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter elements: ");
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to search: ");
        int sn = sc.nextInt();
        
        boolean found = false;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == sn) {
                System.out.println(sn + " first occurred at index " + j);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println(sn + " not found");
        }
    }
}

