import java.util.*;
import java.util.Scanner;
class twoSum {
    public  static String twoSum(int[] nums,int n, int target) {
        
        int left=0,right=n-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                return "yes";
            }
            else if(sum<target){
                left++;
            }
            else{
                right++;
            }
        }
        return "No";
          }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] nums=new int[n];
    for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
    }
    int target=sc.nextInt();
    String res=twoSum(nums,n,target);
    System.out.print(res);
}
}