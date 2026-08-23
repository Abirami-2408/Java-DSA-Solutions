public class Ipp {
   static boolean valid(String part){
if(part.length()==0) return false;
if(part.length()>1 && part.charAt(0)=='0'){
    return false;
}
if(part.length()>3)return false;
int num=Integer.parseInt(part);
if(num>255){
    return false;
}return true;
   }

    static void findIp(String s){
for(int i=1;i<s.length();i++){
    for(int j=i+1;j<s.length();j++){
        for(int k=j+1;k<s.length();k++){
            String part1=s.substring(0,i);
            String part2=s.substring(i,j);
            String part3=s.substring(j,k);
            String part4=s.substring(k);
            if(valid(part1) && valid(part2) && valid(part3)&& valid(part4)){
System.out.println(part1 +"."+part2+"."+part3+"."+part4);

            }
        }
    }
}
    }

     public static void main(String[] args) { 
        String s="101023";
        findIp(s);
        //output:1.0.10.23.,1.0.102.3.,10.1.0.23. ,10.10.2.3. ,101.0.2.3.
    }
}
