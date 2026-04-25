import java.util.HashMap;
public class ContiguousSubarr{
    public static int  equalnoof0sand1s(int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;int maxlen=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
             if (nums[i] == 0) sum += -1;
            else sum += 1;
            if (map.containsKey(sum)) {
                maxlen = Math.max(maxlen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }    
        return maxlen;
    }
        public static void main(String args[]){
            int nums[]={0,1,0};
            int res=equalnoof0sand1s(nums);
            System.out.println(res);//op:2
        }
    }
    
