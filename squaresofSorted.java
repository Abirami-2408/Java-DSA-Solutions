import java.util.Arrays;
public class squaresofSorted {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
    public static void main(String[] args){
        int []nums={4,2,8,3};
       int[] res=sortedSquares(nums);
        System.out.println(Arrays.toString(res));//{4,9,16}     
    }
}
