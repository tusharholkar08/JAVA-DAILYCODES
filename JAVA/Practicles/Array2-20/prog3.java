import java.util.*;
class prog3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = sc.nextInt();

		char arr[] = new char[size];
		for(int i = 0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
		for(int j = 0;j<arr.length;j++){
			if(arr[j]=='a' || arr[j]=='e' || arr[j]=='i' || arr[j]=='o' || arr[j]=='u'){
				System.out.println( "Vowels found at position" + arr[j]);
				System.out.println( "Vowels found at position" + j );
			}
		}
	}
}

