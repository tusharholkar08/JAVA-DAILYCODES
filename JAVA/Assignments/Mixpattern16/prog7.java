import java.util.*;

class prog7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row :");
        int row = sc.nextInt();
         int x = 2;
        for(int i = 1;i <= row;i++){

            for(int j =row; j >= 1; j--){
                    System.out.print(x + " ");
                    x+=2;
            }
            System.out.println();
        }
    }
}

