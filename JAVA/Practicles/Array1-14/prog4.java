import java.util.*;
class prog4{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter row : ");
                int size = sc.nextInt();

                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                }
		int sum=0;
               
                for(int j = 0;j<arr.length;j++){
                        if(arr[j]%2==1){
				sum=sum + arr[j];
			}
		}
                 System.out.println("sum of odd element is "  + sum );
	}
}

