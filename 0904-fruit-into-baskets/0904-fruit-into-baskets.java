class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0, r = 0, maxLen = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        for (r = 0; r < fruits.length; r++) {
            mpp.put(fruits[r], mpp.getOrDefault(fruits[r], 0) + 1);
        
           if (mpp.size() > 2) {
                int leftfruit = fruits[l];
                mpp.put(leftfruit, mpp.get(leftfruit) - 1);
            
                if (mpp.get(leftfruit) == 0) {
                    mpp.remove(leftfruit);
                }
                l++;
            }
            if (mpp.size() <=2) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
        }
        return maxLen;
    }
}