import java.util.*;
class prog9{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter rows :");
                int row =sc.nextInt();

                for(int i=1;i<=row;i++){
                        
                        for(int sp=1;sp<i;sp++){
                                System.out.print("\t");
                        }
                        for(int j=1;j<=(row-i)*2+1;j++){
                                if(j%2==0){
                                        System.out.print( "0" +"\t");
                                        
                                }else{
                                        System.out.print("1" + "\t");
                                        
                                }
                        }
                        System.out.println();
                }
        }
}
