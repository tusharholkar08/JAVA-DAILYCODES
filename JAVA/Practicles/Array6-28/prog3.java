import java.util.*;
class prog3{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int arr[] = new int[size];
                for(int i=0; i<arr.length; i++){
                        System.out.println("enter element ");
                        arr[i]= sc.nextInt();
                }
                


                System.out.println("array is :  ");
                for(int i=0; i<arr.length; i++){
                        if(arr[i]==8){
				 arr[i]=512;

                             
                        }
			System.out.println(arr[i]);
			

                        }
		
                        
                




        }
}
