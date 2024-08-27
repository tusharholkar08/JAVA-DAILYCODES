import java.util.*;
class prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is " + factorial);
    }
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }
        return n * calculateFactorial(n - 1); 
    }
}

