import java.util.*;
class prog4{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size row and col :");
                int row = sc.nextInt();
                int col = sc.nextInt();
                int arr[][] = new int[row][col];
                System.out.println("Enter element : ");
                for(int i = 0; i<arr.length; i++){
                        for(int j = 0; j<arr[i].length; j++){

                        arr[i][j] = sc.nextInt();
                        }
                }
                System.out.println("Enter element : ");
                for(int i = 0; i<arr.length; i++){
                        for(int j = 0; j<arr[i].length; j++){
                        System.out.print(arr[i][j]+ " ");
                        }
                        System.out.println();
                }
		System.out.println(arr[1][1]);
		System.out.println(arr[1]);
		System.out.println(arr);
        }
}
