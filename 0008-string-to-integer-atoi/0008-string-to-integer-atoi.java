class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        long ans=0;
        int sign=+1,i=0;
         //sign
         if(i<s.length() && s.charAt(i)=='+' || s.charAt(i)=='-'){
            sign=(s.charAt(i) =='-')? -1:+1; i++;
         }
         int max=Integer.MAX_VALUE,min=Integer.MIN_VALUE;
         //digit
        while(i<s.length() && Character.isDigit(s.charAt(i) ) ){
            ans=ans*10 + s.charAt(i)-'0';
            if(sign==-1 && -ans<min) return min;
            if(sign==+1 && ans>max) return max;i++;
        }
        
     return (int) (sign*ans);  
    }
}