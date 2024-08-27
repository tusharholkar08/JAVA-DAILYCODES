import java.util.*;
class prog1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();

		int x = 0;
		int arr[] = new int[size];
		for(int i = 0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
		}
		for(int j = 0;j<arr.length;j++){
			if(arr[j]%2==0){
				System.out.println( "Even numbers : "+arr[j]);
				x++;
			}
		}
		System.out.println( "Count is" + x);
	}
}
