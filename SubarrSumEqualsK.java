import java.util.HashMap;

public class SubarrSumEqualsK {
    /* BRUTE public  static int SubArr(int arr[],int  n,int k){
        int sum=0,cnt=0;
        for(int i=0;i<n;i++){
             sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                     cnt++;
                }
            }
        }
        return cnt;
    }*/
    //OPTIMAL
     public  static int SubArr(int arr[],int  n,int k){
        HashMap<Integer,Integer>mpp=new HashMap<>();
        mpp.put(0,1);
        int sum=0,cnt=0;
        for(int num:arr){
            sum+=num;
            if(mpp.containsKey(sum-k)){
                cnt+=mpp.get(sum-k);
            }
                mpp.put(sum,mpp.getOrDefault(sum,0)+1);
        }
        return cnt;
     }
    public static void main(String[] args) {
    int arr[] = {1,2,3};
    int n = arr.length;
    int k=3;
   int result = SubArr(arr, n,k);
        System.out.println("SubArrequalsK: " + result); //output: 2 -[1,2],[3].
    }
}
