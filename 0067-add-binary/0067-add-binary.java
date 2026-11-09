class Solution {
    public String addBinary(String a, String b) {
        int carry=0,i=a.length()-1,j=b.length()-1;
        String res="";
        while(i>=0 || j>=0 || carry!=0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';j--;
            }
            res=(sum%2)+res;
            carry=sum/2;
        }
        return res;
    }
}