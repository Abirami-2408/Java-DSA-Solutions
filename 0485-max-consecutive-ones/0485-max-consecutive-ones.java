class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0;int cnt=0;
      
          
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == 1) {
                    cnt++;
                    maxi = Math.max(maxi, cnt);
                } else
                    cnt = 0;
            

        }
        return maxi;
    }
}