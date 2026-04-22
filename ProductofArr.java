import java.util.Arrays;
/*public class ProductofArr {
    public static int productofarr(int[]arr){
        int n=arr.length;
        int answer[]=new int[n];
         answer[0]=1;
        for(int i=0;i<n;i++){
            answer[i]=arr[i-1]*arr[i-1];
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            answer[i]=answer[i]*right;
            right=right*arr[i];
        }
        return answer;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        int res[]=productofarr(arr);
        System.out.println(Arrays.toString(res));//op:24,12,8,6
        
        
    }*/
   

public class ProductofArr {

    public static int[] productofarr(int[] arr) {
        int n = arr.length;
        int[] answer = new int[n];

        // Step 1: store prefix in answer[]
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * arr[i - 1];
        }

        // Step 2: multiply with suffix using right variable
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right = right * arr[i];
        }

        return answer;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        int res[] = productofarr(arr);

        System.out.println(Arrays.toString(res));
    }
}

