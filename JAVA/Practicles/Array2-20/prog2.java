import java.util.*;
class prog2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();

		int sum = 0;
		int arr[] = new int[size];
		for(int i = 0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
		}
		for(int j = 0;j<arr.length;j++){
			if(arr[j]%3==0){
				System.out.println("Element divided by 3 :" + arr[j]);
				sum=sum+arr[j];
				System.out.println("Sum of element didvsible by 3 " + sum);
			}
		}
	}
}

