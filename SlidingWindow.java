import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {
    public static int kDistinctChar(String s, int k) {
        //your code goes here
        int l=0,r=0,maxlen=0;
        Map<Character,Integer>mpp=new HashMap<>();
        for(r=0;r<s.length();r++){
            mpp.put(s.charAt(r),mpp.getOrDefault(s.charAt(r),0)+1);

        if(mpp.size()>k){
            char ls=s.charAt(l);
            mpp.put(ls,mpp.get(ls)-1);
        
        if(mpp.get(ls)==0) mpp.remove(ls);
        l++;
        }
        maxlen=Math.max(maxlen,r-l+1);
    }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "aababbcaacc" ;int k = 2;
        System.out.println(kDistinctChar(s,k));//6

    }
}
