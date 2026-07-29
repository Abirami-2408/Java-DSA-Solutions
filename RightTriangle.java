public class RightTriangle {
    static void pat1(int n){
        for(int i=0;i<n;i++){
            for(char ch=(char)('E'-i);ch<='E';ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
      public static void main(String[] args){
        int n=5;
        pat1(n);
      }
    
}
