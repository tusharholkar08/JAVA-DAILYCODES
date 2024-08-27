class prog19{
        public static void main(String[] args){
                String str1 ="shashi";
                System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

                 String str2 =new String("shashi");
                 System.out.println(str2);
		 System.out.println(System.identityHashCode(str2));
        }
}  
