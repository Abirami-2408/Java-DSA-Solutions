class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low = 1, high = m*n;
        while (low < high) {
            int mid = (low + high) / 2;
             int count = 0;
        for (int row = 1; row <= m; row++) {
            count += Math.min(n, mid / row);
        }
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    }
