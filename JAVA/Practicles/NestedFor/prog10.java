class prog10{
        public static void main(String[]args){
                int x = 1;
                int row = 4;
                for(int i = 1; i<=row; i++){
                        for(int j=1; j<=row; j++){
                                System.out.print(x+" ");
                                x++;
                        }
                        x-=3;
                        System.out.println();
                }
        }
}
