import java.util.*;

public class CountInversions {

    public static int mergeSort(int[] arr, int low, int high) {
        if (low >= high) return 0;
        int mid = (low + high) / 2;
        int cnt = 0;

        cnt += mergeSort(arr, low, mid);       // left half
        cnt += mergeSort(arr, mid + 1, high);  // right half
        cnt += merge(arr, low, mid, high);     // cross pairs + merge

        return cnt;
    }

    private static int merge(int[] arr, int low, int mid, int high) {
        int cnt = 0;
        int j = mid + 1;

        // ✅ Count Inversions
        for (int i = low; i <= mid; i++) {
            while (j <= high && arr[i] > arr[j]) {
                j++;
            }
            cnt += (j - (mid + 1));
        }

        // Standard merge process
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) temp.add(arr[left++]);
            else temp.add(arr[right++]);
        }
        while (left <= mid) temp.add(arr[left++]);
        while (right <= high) temp.add(arr[right++]);

        for (int i = low; i <= high; i++) arr[i] = temp.get(i - low);

        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        System.out.println("Inversions: " + mergeSort(arr, 0, arr.length - 1)); // Output: 3
    }
}