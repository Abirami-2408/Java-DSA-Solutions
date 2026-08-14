class Solution {
    public String removeDuplicates(String s) {
         char[] answer=new char[s.length()];
          int top=-1;
          for(int i=0;i<s.length();i++){
            if(top>=0 && answer[top]==s.charAt(i)) top--;
            else answer[++top]=s.charAt(i);
          }
          String res="";
          for(int i=0;i<=top;i++){
            res+=(answer[i]);
          }
       
        return res;
    }
    
}