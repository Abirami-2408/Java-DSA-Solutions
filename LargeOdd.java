public class LargeOdd {
    public static String odd(String n){
        for(int i=n.length()-1;i>=0 ;i--){
           
            if(n.charAt(i)%2!=0){
                return n.substring(0,i+1);
            }
        }
return "";
    }
    public static void main(String[] args) {
        String n="7543";
        System.out.println(odd(n));
    }
}
