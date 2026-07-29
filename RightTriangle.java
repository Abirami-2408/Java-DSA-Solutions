public class RightTriangle {
    static void pat1(int n){
        for(int i=0;i<n;i++){
            for(char ch=(char)('E'-i);ch<='E';ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
     static void pat2(int n){
         int space=0;
        for(int i=0;i<n;i++){
             
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
             for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
           space+=2;
          System.out.println(" ");
         
        }
        

for(int i=2;i<=n;i++){
for(int j=1;j<=i;j++){
    System.out.print("*");
}
        for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
    System.out.print("*");
}
System.out.println(" ");
     }
    }
    static void pat3(int n){
        int space=2*n-2;
        for(int i=1;i<=2*n-1;i++){
             int stars=i;
             if(i>n){
                stars=2*n-i;
             }
             for(int j=1;j<=stars;j++){
                System.out.print("*");
             }
              for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
              for(int j=1;j<=stars;j++){
                System.out.print("*");
             }
             System.out.println(" ");
if(i<n){
    space-=2;
}
else space+=2;
 }
      

       
    }
      public static void main(String[] args){
        int n=5;
        //pat1(n);
        pat3(n);
      }
    
}
