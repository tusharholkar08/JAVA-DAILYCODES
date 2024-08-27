:class prog87{
        void fun(){
                 System.out.println("in fun function");
        }
        static void run(){
                 System.out.println("in run function");
        }
        public static void main(String[] args){
                 System.out.println("in main method");
                 run();
		 prog87 obj = new prog87();
		 obj.fun();
        }
}
