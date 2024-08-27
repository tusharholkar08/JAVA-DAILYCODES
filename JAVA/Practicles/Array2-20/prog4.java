import java.util.*;
class prog4{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size :");
                int size = sc.nextInt();
                 System.out.println("Enter element :");
                char arr[] = new char[size];
                for(int i = 0;i<arr.length;i++){
                        arr[i] = sc.next().charAt(0);
                }

		int x = sc.nextInt();
		for(int j = 0;j<arr.length;j++){
			if(arr[j]==x){
				System.out.println( arr[j]);

			}
		}
	}
}
