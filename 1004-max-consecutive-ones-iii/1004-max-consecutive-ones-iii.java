class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, maxlen = 0, zeros = 0, n = nums.length, len = 0;
        while (r < n) {
            if (nums[r] == 0)
                zeros++;
            if (zeros > k) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }
            if (zeros <= k) {
                len = r - l + 1;
                maxlen = Math.max(len, maxlen);
               
            } r++;
        }

        return maxlen;
    }
}