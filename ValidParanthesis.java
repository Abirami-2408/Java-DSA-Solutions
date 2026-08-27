public class ValidParanthesis {
    public static int paren(String s){
        int max=0;int open=0,close=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open+=1;     
            }
            else{
                close+=1;
            }
            if(open==close){
                max=Math.max(max,2*close);
            }
              // Invalid sequence
            if (close > open) {
                open = 0;
                close = 0;
            }
        } // Right to Left
        open = 0;
        close = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == '(')
                open++;
            else
                close++;

            if (open == close)
                max = Math.max(max, 2 * open);

            if (open > close) {
                open= 0;
                close = 0;
            }
        }

        return max;
       
    }
    public static void main(String[] args) {
        String s=")()(";
        System.out.print(paren(s));//output:2
    }
}
