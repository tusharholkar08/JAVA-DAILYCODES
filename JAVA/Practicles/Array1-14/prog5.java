import java.util.*;
class prog5{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size : ");
                int size = sc.nextInt();

                int arr[] = new int[size];
		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int j =0;j<arr.length;j++){
		
			if(arr[j]<10){
				System.out.println(arr[j] + "is less than 10");
			}
		}
	}
}
