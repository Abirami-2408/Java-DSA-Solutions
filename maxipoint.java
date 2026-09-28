public class maxipoint {
    public static int maxiPoint(int []ar,int k){
        int lsum=0,rsum=0,max_sum=0;
        for(int i=0;i<k-1;i++){
            lsum+=ar[i];
            max_sum=lsum;
            int right_end=ar.length-1;
            for(i=k-1;i>=0;i--){
                lsum-=ar[i];
                rsum+=ar[right_end];
                right_end=right_end-1;
                max_sum=Math.max(max_sum,lsum+rsum);
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
       int []ar={6,2,3,4,7,2,1,7,1};
       int k=4;
       System.out.print(maxiPoint(ar,k));
    }
}
