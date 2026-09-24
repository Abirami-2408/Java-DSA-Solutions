class Solution {
    public int maxScore(int[] cardPoints, int k) {
                int lsum = 0;
        int rsum = 0;
        int max_sum = 0;

        // Take first k elements from the left
        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }

        max_sum = lsum;

        int right_end = cardPoints.length - 1;

        // Gradually replace left elements with right elements
        for (int i = k - 1; i >= 0; i--) {
            lsum -= cardPoints[i];
            rsum += cardPoints[right_end];

            right_end--;

            max_sum = Math.max(max_sum, lsum + rsum);
        }

        return max_sum;

    }
}