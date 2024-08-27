import java.util.*;
class prog10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		for(int i = 0;i<arr.length;i++){
			System.out.print("Enter id : ");
			arr[i] = sc.nextInt();
		}
		for(int j = 0;j<arr.length;j++){
                        System.out.println( "Student id is " + arr[j]);
		}
	}
}

