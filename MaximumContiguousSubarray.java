  class  MaximumContiguousSubarray {
    public static int MaxiContiguousSubarray (int arr[],int n){
        int start=0;int sum=0;
int max=Integer.MIN_VALUE;
int ansStart=-1,ansEnd=-1;
for(int i=0;i<n;i++){
    if(sum==0){
        start=i;
    }
    sum+=arr[i];
    if(sum>max){
        max=sum;
        ansStart=start;
        ansEnd=i;
    }
    if(sum<0){
        sum=0;
    }
    
}
// Print subarray
        System.out.print("Subarray: ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");//Subarray: 4 -1 -2 1 5
        }
        System.out.println();

        return max;
    }

public static void main(String[] args) {
    int arr[] = {-2,-3,4,-1,-2,1,5,-3};
    int n = arr.length;
     
    // Print sorted array
   int result = MaxiContiguousSubarray(arr, n);

        System.out.println("Maximum Sum: " + result); //Maximum Sum: 7
    }
}

   
