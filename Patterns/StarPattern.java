package Patterns;
public class StarPattern {
      static void pattern1(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
      static void pattern2(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
     static void pattern3(int n) {
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println(" ");
        }
    }
     static void pattern4(int n) {
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<='A'+(n-i);ch++){
                System.out.print(ch +" ");
            }
            System.out.println(" ");
        }
    }
 static void pattern5(int n) {
        for(int i=0;i<n;i++){
            char ch=(char)('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch +" ");
            }
            System.out.println(" ");
        }
    }
    static void pattern6(int n) {
        for(int i=0;i<n;i++){
           int breakpoint=(2*i+1)/2;
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            char ch='A';
            for(int k=1;k<=(2*i+1);k++) {
            System.out.print(ch);
if(k<=breakpoint){
    ch++;
}
else ch--;
            }
             for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println(" ");
        }
    }
    


    
    public static void main(String[]args){
        int n=5; 
       /*pattern4(n);
        pattern2(n);    
        pattern3(n); 
        pattern5(n);   */ 
        pattern6(n);
    
    }   
}
