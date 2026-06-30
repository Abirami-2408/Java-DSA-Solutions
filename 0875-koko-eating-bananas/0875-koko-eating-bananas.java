class Solution {
    int funcofTotHrs(int []piles,int mid){
        int totalhrs=0;
        for(int i=0;i<piles.length;i++){
            totalhrs+=Math.ceil((double)piles[i]/mid);
        }
        return totalhrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        int low=1,high=maxi;int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            if(funcofTotHrs(piles,mid)<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}