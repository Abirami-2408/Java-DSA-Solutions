import  java.util.*;
public class test{
    public static void patternStar( int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        } 
        //3
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }  
        //4
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println(" ");
        } 
        //6
        for (int i=1;i<=6;i++){
            for (int j=1;j<=6-i+1;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        } 
        //8
        for (int i=0;i<n;i++){
            //space
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<(2*n-(2*i+1));j++){
                System.out.print("*");
            }
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        } 
        //9(7,8)

        for (int i=0;i<n;i++){
            //space
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0;j<((2*i+1));j++){
                System.out.print("*");
            }
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        } 

        for (int i=0;i<n;i++){
            //space
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<(2*n-(2*i+1));j++){
                System.out.print("*");
            }
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        } 
        //10
        for(int i=0;i<=2*n-1;i++){
            int stars=i;
            if(i>n){
                 stars=2*n-i;
                //System.out.print("*");
            }

            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //11
        int start=1;
         for (int i=0;i<=n;i++){
            if(i%2==0){ start=1;}
            else{
                 start=0;
            }
            for (int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;    
            }
            System.out.println(" ");
        } 
        //12
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=0;j<=space;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println(" ");
            space-=2;
        } 
        //13Pattern
        int num=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num+=1;
            }
            System.out.println(" ");
        }
        //14Pattern
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A' +i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
        //15Pattern
        for(int i=0;i<n;i++){
            for(char ch='A';ch<= 'A'+(n-i-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
        //16Pattern
        for(int i=0;i<n;i++){
            char ch=(char )('A' + i );
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
        //17
        for (int i=0;i<n;i++){
            //space
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char ch='A' ;
            int breakpoint=(2*i+1)/2;
            for (int j=1;j<=((2*i+1));j++){
                System.out.print(ch+" " );
                 if(j<=breakpoint){
                    ch++;
                } 
                else ch--;
            }
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        } 
        //18Pattern
        for(int i=0;i<=n;i++){
            for(char ch= (char)('E'-i) ;ch<= 'E';ch++){
                System.out.print(ch +" ");
            }
            System.out.println(" ");
        }
        //19Pattern
         int initial=0;
        for(int i=0;i<n;i++){
            //stars
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<initial;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            initial+=2;
            System.out.println(" ");
        }
        //down pattern:
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //20Pattern
        int sp=2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n){ stars=2*n-i;}
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println(" ");
            if(i<n) sp-=2;
            else sp+=2;   
        }
         //21Pattern
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
         } //22Pattern
    for(int i=0;i<2*n-1;i++){
        for(int j=0;j<2*n-1;j++){
            int top=i;
            int left=j;
            int right=(2*n -2)-j;
            int down=(2*n -2)-i;
            System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
        }
         System.out.println("");
    }

    }   
    public static void main (String[] args){
        patternStar(4);    
}
}