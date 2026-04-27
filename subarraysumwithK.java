import java.util.HashMap;
public class subarraysumwithK {
    public  static int subarraysumwithK(int []arr,int k){
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int sum=0;int maxlen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxlen=i+1;
            }
            if(mpp.containsKey(sum-k)){
                maxlen=Math.max(maxlen,i-mpp.get(sum-k));
            }
            if(!mpp.containsKey(sum)){
                mpp.put(sum,i);
            }
        }
        return maxlen;
    }
 public static void main(String args[]){
    int arr[]={1,-1,5,-2,3};
    int k=3;
    System.out.println(subarraysumwithK(arr, k));//4
 }     
    
}
