import java.util.Scanner ;


class prog10{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in) ;

		System.out.println("Enter Array Size :");
		int size = sc.nextInt();

		int ary[] = new int[size] ;
		for(int i = 0 ; i<size ; i++){

			System.out.println("Enter Array 1  Element : ");
			ary[i] = sc.nextInt() ;

	       }

	     

	       int max = Integer.MIN_VALUE ;


	       for(int i = 0 ; i<size ; i++){
	       
		       if(ary[i]>max){
		       
			       max = ary[i] ;
		       }
	       }

	       int max2 = 0 ;

	       for(int i = 0 ; i< size ; i++){
	       
		       if(ary[i]>max2 && ary[i]<max){
		       
		       
			       max2 = ary[i] ;
		       }
	       }

	       int max3 = 0 ;
	       for(int i = 0 ; i< size ; i++){

		       if(ary[i]> max3 && ary[i]<max2){
		       
			       max3 = ary[i] ;
		       }

	       }


	       System.out.println("third largest element is :"+ max3);



	}
}

