
public class NumberPattern {
      static void pat1(int n){
         int first=1,add=1;
        for(int i=1;i<=n;i++){
           int start=first;        
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start+=2;
            }
             if(i>=3) add+=1;
            first+=add;
            System.out.println();
        }
       
    }

      public static void main(String[] args){
        int n=6;
        pat1(n);
} 
}
