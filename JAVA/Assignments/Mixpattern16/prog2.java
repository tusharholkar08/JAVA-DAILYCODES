import java.util.*;
class prog2{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter row : ");
                int row = sc.nextInt();
		int x = row + 64;
		int num = row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print((char)x + " " + num + " ");
				num--;
			}
			num=row+i;
			System.out.println();
		}
	}
}
