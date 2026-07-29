import java.util.Arrays;

public class TwoNonRepeating {
    public static int [] TwoNonRepeating(int [] arr){
        int n=arr.length,j=0;int ans[]=new int[2];
     for (int i = 0; i < arr.length - 1; i++) {
    if (arr[i] == arr[i + 1]) {
        ans[j++] = arr[i];

        while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
            i++;
        }
    }
}
        return ans;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,3,4,4,4,4,5};
        int[] res=TwoNonRepeating(arr);
        System.out.print(Arrays.toString(res));
       /*for(int i=0;i<res.length;i++){
            System.out.print(res[i]);
        } */ 
    }
}
