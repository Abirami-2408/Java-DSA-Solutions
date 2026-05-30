class Solution {
    public double myPow(double x, int n) {
         if(n==0) return 1;
         if(x==0) return 0;
         double ans=1;
         long exp=n;
         if(exp<0){
            x=1/x;
            exp=-exp;
         }
         while(exp>0){
            if(exp%2==1) ans=ans*x;
           x=x*x;
           exp=exp/2;
         }
         return ans;      
    }
    
}
    