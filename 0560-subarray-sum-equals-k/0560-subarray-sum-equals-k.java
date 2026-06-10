class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> mpp = new HashMap<>();

        mpp.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            sum += num;

            if (mpp.containsKey(sum - k)) {
                count += mpp.get(sum - k);
            }

            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}