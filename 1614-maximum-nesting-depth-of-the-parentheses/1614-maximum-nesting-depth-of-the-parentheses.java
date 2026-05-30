class Solution {
    public int maxDepth(String s) {
         int depth=0,maxi=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++;
                maxi=Math.max(maxi,depth);
            }
            if(s.charAt(i)==')'){
                depth--;
            }
            
        }
        return maxi;
    }
}