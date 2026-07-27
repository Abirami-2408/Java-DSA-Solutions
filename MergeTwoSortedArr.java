import java.util.Arrays;

public class MergeTwoSortedArr {

    static boolean isDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    static int[] Merge(int[] ar1, int[] ar2) {

        if (isDescending(ar2)) {
            reverse(ar2);
        }

        int m = ar1.length;
        int n = ar2.length;

        int l = 0, r = 0, i = 0;
        int[] ans = new int[m + n];

        while (l < m && r < n) {
            if (ar1[l] <= ar2[r]) {
                ans[i++] = ar1[l++];
            } else {
                ans[i++] = ar2[r++];
            }
        }

        while (l < m) {
            ans[i++] = ar1[l++];
        }

        while (r < n) {
            ans[i++] = ar2[r++];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] ar1 = {1, 3, 5};
        int[] ar2 = {8, 6, 4};

        int[] res = Merge(ar1, ar2);

        System.out.println(Arrays.toString(res));
    }
}