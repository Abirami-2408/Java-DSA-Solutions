public class ContainerWithMostWater{
    public static int containsmost(int[]height,int n){
        int left=0,right=n-1,maxwater=0;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int width=right-left;
            int area=h*width;
            maxwater=Math.max(maxwater,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxwater;

    }
    public static void main(String args[]){
        int []height={1,8,6,2,5,4,8,3,7};
        int n=height.length;
        System.out.println(containsmost(height,n));//output:49
    }
}