import java.util.Scanner ;


class prog5{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in) ;

		System.out.println("Enter Array Size :");
		int size1 = sc.nextInt();

		int ary1[] = new int[size1] ;
		for(int i = 0 ; i<size1 ; i++){

			System.out.println("Enter Array 1  Element : ");
			ary1[i] = sc.nextInt() ;

	       }


		System.out.println("Enter Array 2 Size :");
		int size2 = sc.nextInt();

		int ary2[] = new int[size2] ;
		for(int i = 0 ; i<size2 ; i++){

			System.out.println("Enter Array 2  Element : ");
			ary2[i] = sc.nextInt() ;

		}	


		int max = size1 + size2 ;
		int ary3[] = new int[max];

		int i = 0 ;
		for( i = 0 ; i<size1 ; i++){
		
			ary3[i] =ary1[i] ; 
		}

		for(int j = 0 ; j< size2 ; j++){
		
			ary3[i] = ary2[j] ; 
			i++ ;
		}


		for(int k = 0 ; k<ary3.length ; k++){
		
			System.out.print(ary3[k]+" ");
		}
	    

	}
}

