import java.util.Scanner ;


class prog9{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in) ;

		System.out.println("Enter Array Size :");
		int size = sc.nextInt();

		int ary[] = new int[size] ;
		for(int i = 0 ; i<size ; i++){

			System.out.println("Enter Array 1  Element : ");
			ary[i] = sc.nextInt() ;

	       }

	       int count = 0 ;


	       for(int i = 0 ; i< size ; i++){
	       

		       int num = ary[i] ;
		       int num2 = 0 ;
		       int rem = 0 ;
		       while(num!=0){

			      rem = num%10 ;
			      num2 = num2*10+rem ;
			      num = num/ 10 ;

		       }

		       if(ary[i] == num2){
		       
			       count++ ;

		       }

	       }

	          
	      System.out.println("the palindrome number count is : "+ count);
		
	}
}

