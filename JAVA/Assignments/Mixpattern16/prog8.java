import java.util.*;

class prog8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row :");
        int row = sc.nextInt();
         int x = 67 +row;
        for(int i = 1;i <= row;i++){

            for(int j =row; j >= i; j--){
		   System.out.print((char)x + " ");
		  x--; 
	    }
	    System.out.println();
	}
    }
}
