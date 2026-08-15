public class moveRight {
    static void funcrightshift(int[]arr,int k){
int n=arr.length;
k=k%n;
reverse(arr,0,n-1);//5,4,3,2,1
reverse(arr,0,k-1);//4 5 3 2 1.
reverse(arr,k,n-1);//4 5 1 2 3 
}
static void reverse(int arr[],int left,int right){
while(left<=right){
    int temp=arr[left];
    arr[left]=arr[right];
    arr[right]=temp;
    left++;right--;
}
}
 public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
     funcrightshift(arr, 7);// 3 4 5 1 2 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
