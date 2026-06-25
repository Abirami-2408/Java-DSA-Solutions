public class Allocate {
   
    public  static int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        int sum=0;int maxi=Integer.MIN_VALUE;
        if(k>n) return -1;
        for(int i=0;i<arr.length;i++){
             maxi=Math.max(arr[i],maxi);
        sum+=arr[i];
        }
       
        int low=maxi,high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            if(func(arr,mid)>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
   static  int func(int arr[],int pages){
        int pageStu=0,stu=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+pageStu<=pages){
                pageStu+=arr[i];
            }
            else{
                stu+=1;
                pageStu=arr[i];
            }
        }
        return stu;
    
}
 public static void main(String args[]){
         int arr[] = {12, 34, 67, 90};
         int  k = 2;
         int anss=findPages(arr,k);
         System.out.print(anss);//113
    }
}
