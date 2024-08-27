import java.util.*;
class prog6{
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
                        if(arr[i]%5==0){
				System.out.println("an element multiple of 5 found at index :"+ i);

                                


                        }
                       


                        }







        }
}
