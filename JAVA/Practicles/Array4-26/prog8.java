import java.util.*;
class prog8{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();
                char arr[] = new char[size];
                for(int i=0; i<arr.length; i++){
                        System.out.println("enter element ");
                        arr[i]= sc.next().charAt(0);
                }
               int num = arr[2] ;

                System.out.println("array is :  ");
                for(int i=0; i<arr.length; i++){
                        if(num==arr[i]){
                                System.out.println(arr[i]+"occurs a 2 times in array ");
                        }
                }
        }
}
