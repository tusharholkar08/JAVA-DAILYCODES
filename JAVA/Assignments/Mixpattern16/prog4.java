import java.util.*;

class prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter row :");
        int row = sc.nextInt();
        
        for(int i = row;i >= 1;i--){
		int x = i;
		int z = 1;
            for(int j = row; j >= i; j--){
               System.out.print(i*z + " ");
	       z++;
            }
            System.out.println();
	    
        }
    }
}
