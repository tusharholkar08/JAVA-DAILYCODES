import java.util.*;

class prog9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Prime numbers in the array:");
        for (int i = 0; i < size; i++) {
            boolean isPrime = true;
            if (arr[i] <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}

