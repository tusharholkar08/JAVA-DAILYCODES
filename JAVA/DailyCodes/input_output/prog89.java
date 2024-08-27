class prog89{
        void methodfun(){
                 System.out.println("in fun function");
        }
         void methodrun(){
                 System.out.println("in run function");
        }
        void methodgun(){
                System.out.println("in gun method");
        }
        public static void main(String[] args){
                 System.out.println("in main method");
		 prog89 obj = new prog89();
                 obj.methodfun();
                 obj.methodgun();
                 obj.methodrun();
        }
}
