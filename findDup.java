import java.util.Arrays;

public class findDup {

    public static int[] findDupli(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] res = new int[2];

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                res[k++] = arr1[i];
                i++;
                j++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 7, 8, 9};

        int[] ans = findDupli(arr1, arr2);
          for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}