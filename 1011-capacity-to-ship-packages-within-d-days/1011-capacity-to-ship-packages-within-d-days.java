class Solution {
    int func(int []weights,int capacity){
        int load=0,days=1;
        for(int i=0;i<weights.length;i++){
            
            if(load+weights[i] >capacity){
                days=days+1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }

        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxi=Integer.MIN_VALUE,sum=0;
        for(int a:weights){
            maxi=Math.max(a,maxi);
            sum+=a;
        }
        int low=maxi,high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            if(func(weights,mid)<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}