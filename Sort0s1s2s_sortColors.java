class Sort0s1s2s_sortColors{
public static void sort0s1s2s(int arr[],int n){
    int low=0,mid=0;
    int high=n-1;
    while(mid <= high){
        if(arr[mid]==0){
            int temp=arr[low];
            arr[low]=arr[mid];
            arr[mid]=temp;
            mid++;
            low++;
        }
        else if(arr[mid]==1){
            mid++;
        }
        else{
            int temp=arr[high];
            arr[high]=arr[mid];
            arr[mid]=temp;
            mid++;
            high--;
        }
    }
}

public static void main(String[] args) {
    int arr[] = {2, 0, 1, 0};
    int n = arr.length;
    sort0s1s2s(arr, n);
    // Print sorted array
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");//output:0 0 1 2.
    }
}
}