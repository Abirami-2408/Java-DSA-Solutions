class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, start = 0, ansStart = -1, ansEnd = -1;
        int maxlen = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (sum==0) {
                start = i;
            }
            sum +=nums[i];
            if (sum > maxlen) {
                maxlen = sum;
                ansStart = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxlen;
    }
}