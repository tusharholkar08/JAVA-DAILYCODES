import java.util.*;

class prog10{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Rows : ");
                int row = sc.nextInt();

                for(int i = 1; i <= row; i++){
                        int x = 64 + i;
                        for(int j = row; j >= i; j--){
                                if(row%2==0){
					if(x%2==0){
						System.out.print((char)x);
						x++;
					}
					else{
						System.out.print(x);
						x++;
					}
				}
				else{
					if(x%2==1){
						System.out.print((char)x);
						x++;
					}
					else{
						System.out.print(x);
						x++;
					}
                 	}

                }
		System.out.println();

        }
}
}
