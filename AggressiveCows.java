import java.util.Arrays;
class AggressiveCows {
	public  static int aggressiveCows(int[] stalls, int k) {
		// code here
		Arrays.sort(stalls);
		int n = stalls.length;
		int low = 0, high = stalls[n-1]-stalls[0];
		while (low <= high) {
			int mid = (low + high)/2;
			if (canWePlace(stalls, mid, k) == true) {
				int ans = mid;
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return high;
	}
	 static boolean canWePlace(int stalls[], int d, int cows) {
		int cnt = 1, lastPos = stalls[0];
		for (int i = 1; i<stalls.length; i++) {
			if (stalls[i]-lastPos >= d) {
				cnt++;
				lastPos = stalls[i];
			}
			if (cnt >= cows){
			    	return true;
			}
			
		}
		return false;
	}
    public static void main(String args[]){
         int stalls[] = {2, 12, 11, 3, 26, 7};
         int  k = 5;
         int anss=aggressiveCows(stalls,k);
         System.out.print(anss);
    }
}
