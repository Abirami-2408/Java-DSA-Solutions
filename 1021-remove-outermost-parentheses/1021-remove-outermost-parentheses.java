class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();int dep=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                dep++;
                if(dep>1) ans.append(c);
            }
            else{
                dep--;
                if(dep>0) ans.append(c);
            }
        }
        return ans.toString();

    }
}