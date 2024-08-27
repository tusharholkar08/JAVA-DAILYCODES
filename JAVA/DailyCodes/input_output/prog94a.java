class StaticDemo{

        int X = 30;

        static int Y = 40;
        void fun(){
                System.out.println("in fun");
        }
        static void run(){
                 System.out.println("in run");
        }
        public static void main(String[] args){
                StaticDemo obj = new StaticDemo();
                 System.out.println(x);
                  System.out.println("obj.y");
                  fun();
                  obj.run();
        }
}
