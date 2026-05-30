 import java.util.*;
class cnttriplet{
	public  static int cntTriplet(int[] arr) {
		// code here.
		int n = arr.length;
		Arrays.sort(arr);
		int sum = 0,cnt=0;
		for (int i = 0; i<n; i++) {
			int l = i + 1, r = n - 1;
			while (l<r) {
				sum = arr[l]+arr[r]+arr[i];
				if (sum == 0) {
					cnt += 1;
                    l++;
                    r--;
				}
				
				else if (sum<0) {
					l++;
				}
				else
					r--;
				
			}
		}
		return cnt;
	}
    public static void main(String args[]){
        int arr[]={-5,3,2,-1,0,1};
        System.out.println(cntTriplet(arr));// output is 2:-{-5,3,2},{-1,0,1}
    }
}
