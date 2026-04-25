public class TrappingRainWater {
    public static int trap(int[] height) {
        int left=0,right=height.length-1;
        int leftMax=0,rightMax=0,total=0;
       while(left<right){
            if(height[left]<height[right]){
                if(leftMax>height[left]){
                    total+=leftMax-height[left];
                }
                else{
                    leftMax=height[left];
                }
                left=left+1;
            }
            else{
                if(rightMax>height[right]){
                    total+=rightMax-height[right];
                }
                else{
                    rightMax=height[right];
                }
                right=right-1;
            }
        }
        return total;  
    }
    public static void main (String args[]){
        int []height={3,0,2,0,4};
        int result=trap(height);
        System.out.println(result);
    }

    
}
