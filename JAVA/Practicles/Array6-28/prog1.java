import java.util.*;
class prog1{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int arr[] = new int[size];
                for(int i=0; i<arr.length; i++){
                        System.out.println("enter element ");
                        arr[i]= sc.nextInt();
                }
		boolean descending = true;


                System.out.println("array is :  ");
                for(int i=0; i<arr.length; i++){
                        if(arr[i]<arr[i+1]){
                                descending = false;
				break;
                        }
                }
		if(descending){
			System.out.println("ginven array is decending ");
		}
		else{
			System.out.println("given array is not decending ");
		}


        }
}

