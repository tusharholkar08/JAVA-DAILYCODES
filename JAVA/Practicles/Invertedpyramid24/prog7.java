import java.util.*;
class prog7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows :");
		int row =sc.nextInt();

		for(int i=1;i<=row;i++){
			int ch=65;
			for(int sp=1;sp<i;sp++){
				System.out.print("\t");
			}
			for(int j=1;j<=(row-i)*2+1;j++){
				if(j<(row-i+1)){
					System.out.print((char)ch++ +"\t");
				}else{
					System.out.print((char)ch-- + "\t");
				}
			}
			System.out.println();
		}
	}
}
