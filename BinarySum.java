public class BinarySum {
public static String binarySum(String a,String b){
    int i=a.length()-1,j=b.length()-1;
    int carry=0;
    String res="";
    while(i>=0 || j>=0 || carry !=0){
        int sum=carry;
        if(i>=0){
            sum+=a.charAt(i)-'0';i--;
        }
        if (j>=0) {
            sum+=b.charAt(j)-'0';
            j--; 
        }
        res=(sum%2)+res;
        carry=sum/2;
    }
    return res;

}


    public static void main(String[] args) {
        String a="1010";
        String b="1011";
        String ans=binarySum(a,b);
        System.out.println(ans);
    }
}
