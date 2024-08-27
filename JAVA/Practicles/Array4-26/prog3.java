import java.util.*;
class prog3{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int arr[] = new int[size];
                int sum = 0;
                for(int i=0; i<arr.length; i++){
                        System.out.println("enter element ");
                        arr[i]= sc.nextInt();
                }
                int lar = arr[2];
                
                System.out.println("array is :  ");
                for(int i=0; i<arr.length; i++){
                        
				
                                 System.out.println("the second largest element is the array is :"+lar);
				 
                        
                        /*else if(arr[i]>max){
                                max = arr[i];


                        }*/
                }

                /*int diff = 0;
                diff = max-min;
                System.out.println("the difference between min and max elenment :"+ diff);
*/

        }

}
