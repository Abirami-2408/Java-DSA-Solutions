import java.util.ArrayList;

class Kthelement {
	public static int kthElement(int a[], int b[], int k) {
		// code here
		int i = 0; int j = 0;
		ArrayList<Integer>ls = new ArrayList<Integer>();
		while (i<a.length && j<b.length) {
			if (a[i]<b[j]) {
				ls.add(a[i]);
				i++;
			}
			else {
				ls.add(b[j]); j++;
			}
			
		}
		while (i<a.length) {
			ls.add(a[i]);
			i++;
		}
		while (j<b.length) {
			ls.add(b[j]); j++;
		}
		int ans = ls.get(k - 1);
		return ans;
	}
    public static void main (String[]args){
        int a[]={1, 4, 8, 10, 12};
        int  b[] = {5, 7, 11, 15, 17};
        int k = 6;
        System.out.println(kthElement(a,b,k));//10
    }
}
