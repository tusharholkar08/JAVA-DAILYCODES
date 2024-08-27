import java.util.*;
class prog6{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                char arr[] = new char[size];
                for(int i=0; i<arr.length; i++){
                        System.out.println("enter element ");
                        arr[i]= sc.next().charAt(0);
                }
		int count = 0;
		int num = 0;


                System.out.println("array is :  ");
                for(int i=0; i<arr.length; i++){
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='o' || arr[i]=='i' || arr[i]=='u'){
				count++;

			}
			else{
				num++;
				

                        }
		}
			 System.out.println(count);
			  System.out.println(num);
                
        }
}
