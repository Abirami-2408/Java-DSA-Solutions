class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int repeating=-1;
        int []hash=new int [n+1];
        for(int i=0;i<n;i++){
            hash[nums[i]]++;
        }
        for(int i=0;i<=n;i++){
            if (hash[i]==2 || hash[i]>=2) {
                repeating=i;
    }
   
}
 return repeating;
}
}