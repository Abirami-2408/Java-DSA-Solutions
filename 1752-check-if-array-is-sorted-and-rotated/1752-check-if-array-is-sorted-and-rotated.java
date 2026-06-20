class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        boolean hasDropped = false;
        
        for (int i = 0; i < n; i++) {
            // Check if there is a break in the non-decreasing order
            if (nums[i] > nums[(i + 1) % n]) {
                if (hasDropped) {
                    return false; // Found a second drop, immediately invalid
                }
                hasDropped = true; // Mark that we found our one allowed drop
            }
        }
        
        return true;
    }
}