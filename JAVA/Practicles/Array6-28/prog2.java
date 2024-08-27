import java.util.*;
class prog2{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                int arr[] = new int[size];
                for(int i=0; i<arr.length; i++){
                        System.out.println("enter element ");
                        arr[i]= sc.nextInt();
                }
                int count = 0;
		int sum = 0;


                System.out.println("array is :  ");
                for(int i=0; i<arr.length; i++){
                        if(arr[i]%2==1){
                                
                               sum = sum+arr[i];
			       count++;
			}
			else{
			}

                        }
		System.out.print("sum of all prime number: " + sum);
		System.out.print("count of all prime number: " + count);
                }
               
        


        }

