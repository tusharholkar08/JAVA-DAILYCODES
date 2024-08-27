import java.util.*;
class prog4{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int arr[] = new int[size];
                int sum = 0;
                for(int i=0; i<arr.length; i++){
                        System.out.println("enter element ");
                        arr[i]= sc.nextInt();
                }
               int num = arr[0] ;

                System.out.println("array is :  ");
                for(int i=0; i<arr.length; i++){
			if(num==arr[i]){
				System.out.println(arr[i]+"occurs a 2 times in array ");
			}
		}
	}
}
 
