class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        long val=(long) m*k;
        if (val>n) return -1;
        int mini=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mini=Math.min(mini,bloomDay[i]);
            maxi=Math.max(maxi,bloomDay[i]);
        }
        int low=mini,high=maxi;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,k,m)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    boolean possible(int bloomDay[],int days,int k,int m){
        int cnt=0,noOfBoq=0;
         int n=bloomDay.length;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=days){
                cnt++;
            }
            else{
                noOfBoq+=(cnt/k);
                cnt=0;
            }
        }
        noOfBoq+=(cnt/k);
        return ( noOfBoq>=m);
    }
}