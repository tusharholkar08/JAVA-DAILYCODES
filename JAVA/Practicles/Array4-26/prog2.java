import java.util.*;
class prog2{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int arr[] = new int[size];
                int sum = 0;
                for(int i=0; i<arr.length; i++){
                        System.out.println("enter element ");
                        arr[i]= sc.nextInt();
                }
		int min = arr[0];
		int max = arr[0];
                System.out.println("array is :  ");
                for(int i=0; i<arr.length; i++){
                        if(arr[i]<min){
				min = arr[i];
			}
			else if(arr[i]>max){
				max = arr[i];

                
			}
		}

                int diff = 0;
		diff = max-min;
		System.out.println("the difference between min and max elenment :"+ diff);
		
                
        }

}
