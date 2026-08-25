public class Secret {
    public static void secret(String s){
        String res=" ";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int num=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    num=num*10+(s.charAt(i)-'0');i++;
                }
                if(num>=1 && num<=26){
                    res+=(char)('A'+num-1);
                }
            }
        }
    
    System.out.println(res);
    }
    
    public static void main(String[] args) {
        String s="AB12C9D30";
        secret(s);// output :LI
    }
}
