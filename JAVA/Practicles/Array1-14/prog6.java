import java.util.*;

class prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row : ");
        int size = sc.nextInt();

        char[] ch = new char[size];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);
        }

        for (int j = 0; j < ch.length; j++) {
            System.out.println( "Elements are :" + ch[j]);
        }
    }
}
