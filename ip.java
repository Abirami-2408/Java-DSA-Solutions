public class ip {
    static void findIp(String s,int index,int parts,String current){
        if(parts==4){
            if(index==s.length()){
                System.out.println(current);
            }
            return;
        }
        for(int i=index;i<s.length();i++){
            String part=s.substring(index,i+1);
            if(part.length()>1 && part.charAt(0)=='0') break;
            if(Integer.parseInt(part)>255)break;
            findIp(s, i+1, parts+1, current+part+".");
        }
    }
    public static void main(String[] args) {
        String s="101023";
        findIp(s, 0, 0, "");
    }
}
