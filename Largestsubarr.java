public class Largestsubarr {
    public static int func(int arr[],int k){
        int right=0,left=0,sum=0;
        int max=0;
       while (right < arr.length) {

            sum += arr[right];
            right++;

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                max = Math.max(max, right - left);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,1,3,3};int k=3;
        System.out.print(func(arr,k));

    }
}
