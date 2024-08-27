import java.util.*;
class prog4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        if (isComposite(num)) {
            System.out.println(num + " is a composite number.");
        } else {
            System.out.println(num + " is not a composite number.");
        }
    }
    public static boolean isComposite(int n) {
        if (n <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true; 
            }
        }
        return false; 
    }
}


