
/**
 * RemoveAdjDupli
 */
public class RemoveAdjDupli {
    public static String  removeadj(String str){
        char[] answer=new char[str.length()];
          int top=-1;
          
          
          for(int i=0;i<str.length();i++){
            if(top>=0 && answer[top]==str.charAt(i)) top--;
            else answer[++top]=str.charAt(i);
          }
          String res="";
          for(int i=0;i<=top;i++){
            res+=(answer[i]);
          }
       
        return res;
    }
    public static void main(String[] args) {
        String str="DBAABDAB";
        System.out.println(removeadj(str));//"AB"
        System.out.println(removeadj("ABDAADBDAABB"));//AD (TC:O(n))
    }
}