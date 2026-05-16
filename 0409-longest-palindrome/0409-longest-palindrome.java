class Solution {
    public int longestPalindrome(String s) {
        int freq[]=new int[126];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        int length=0;
        for(int cnt :freq){
            length+=(cnt/2)*2;
            if(length%2==0 && cnt%2==1) length++;
        }
        return length;
    }
}