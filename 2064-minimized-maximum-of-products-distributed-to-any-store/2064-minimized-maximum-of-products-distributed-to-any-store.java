class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int maxi = 0;

        for (int q : quantities) {
            maxi = Math.max(maxi, q);
        }

        int low = 1, high = maxi;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (storesNeeded(quantities, mid) <= n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    int storesNeeded(int[] quantities, int p) {
        int stores = 0;

        for (int q : quantities) {
            stores += (q + p - 1) / p;
        }

        return stores;
    }
}