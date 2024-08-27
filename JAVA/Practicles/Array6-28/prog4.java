import java.util.Scanner ;


class prog4{

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in) ;

		System.out.println("Enter Array Size :");
		int size = sc.nextInt();

		int ary1[] = new int[size] ;
		for(int i = 0 ; i<size ; i++){

			System.out.println("Enter Array Element : ");
			ary1[i] = sc.nextInt() ;

	       }

		int ary2[] = new int[size] ;
		for(int i = 0 ; i<size ; i++){

			System.out.println("Enter Array Element : ");
			ary2[i] = sc.nextInt() ;

		}
		
		System.out.println("Common Elements are : ");

		for(int i =0 ; i< size  ; i++){
		
			for(int j = 0 ; j<size ;j++){
			
				if(ary1[i]==ary2[j]){
				
					System.out.print(ary1[i]+" ");
				}
			} 
		}
	      
	    

	}
}
 
