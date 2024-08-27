import java.util.*;

class prog10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        long num = sc.nextLong();

        long reversedNum = 0;
        while (num != 0) {
            long remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        System.out.print("Output: ");
        while (reversedNum != 0) {
            long digit = reversedNum % 10;
            if (digit % 2 != 0) {
                System.out.print(digit * digit + ", ");
            }
            reversedNum /= 10;

         }
        System.out.println();
    }
}
