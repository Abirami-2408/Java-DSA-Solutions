class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int start = 0;
        int index = -1;
        //1.find break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {//check break point
                index = i;
                break;
            }
        }
        //2.if already descending
       if (index == -1) {
    reverse(nums, start, n - 1);
    return;
}
        //3.swap
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        reverse(nums, index + 1, n - 1);

    }

    private void reverse(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}