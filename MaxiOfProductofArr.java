
public class MaxiOfProductofArr {
    public static int productofarr(int[] arr) {
        int n = arr.length;
        int prefix=1,suffix=1;
      int answer=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        if(prefix==0) prefix=1;
        if(suffix==0)suffix=1;
        prefix=prefix*arr[i];
        suffix=suffix*arr[n-i-1];
        answer=Math.max(answer,Math.max(prefix,suffix));
      }
        return answer;
    }
    public static void main(String args[]) {
        int arr[] = {2,3,-2,4};
        int res = productofarr(arr);
        System.out.println((res));//op:6
    }
}

