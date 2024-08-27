import java.util.*;

class prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row :");
        int row = sc.nextInt();

        for(int i = 1;i <= row;i++){
		int x = 64+row;
		int num = row;
            
            for(int j = 1; j <= i; j++){
		    if(i%2==0){
			    System.out.print(num + " ");
			    num--;
		    }else{
			    System.out.print((char)x + " ");
			    x--;
		    }
	    }
	    System.out.println();
	}
    }
}
