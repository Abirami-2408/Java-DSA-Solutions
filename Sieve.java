import java.util.*;
class Sieve{
	public  static int[] sieve(int n) {
		// code here
		List<Integer> ls = new ArrayList<>();
		int prime[] = new int [n + 1];
		//black box
		for (int i = 2; i<=n; i++) {
			prime[i] = 1;
		}
		for (int i =2; i<=n; i++) {
			if (prime[i] == 1) {
				for (int j = i*i; j<=n; j += i) {
					prime[j] = 0;
				}
			}
		}
		for (int i = 2; i<=n; i++) {
			if (prime[i] == 1) {
				ls.add(i);
			}
		}
		int[] ans = new int[ls.size()];
		for (int i = 0; i < ls.size(); i++) {
			ans[i] = ls.get(i);
		}
		
		return ans;
		
	}
	public static void main (String args[]){
		int n=10;
		System.out.println(Arrays.toString(sieve(n))); //2,3,5,7.
	}
}
