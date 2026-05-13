class Solution {
    int start=0,maxlen=1;
    public String longestPalindrome(String s) {
       
         int n=s.length();
        for(int i=1;i<n;i++){
            expand(s,i-1,i+1);//odd
            expand(s,i-1,i);//even
        }
        return (s.substring(start,start+maxlen));
    }
    public void expand(String s,int l,int r){
         int n=s.length();
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
            if(r-l+1>maxlen){
                maxlen=r-l+1;
                start=l;
            }
            l--;r++;
        }

    }
}