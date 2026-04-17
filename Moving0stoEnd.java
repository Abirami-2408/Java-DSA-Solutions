<<<<<<< HEAD
public class Moving0stoEnd {
public  static void moving0s(int arr[],int  n){
    int j=0;
for(int i=0;i<n;i++){
    if(arr[i]!=0){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j++;
    }
}
}   
public static void main(String[] args) {
    int arr[] = {2,0,3, 0, 1, 0};
    int n = arr.length;
    moving0s(arr,n);
    // Print sorted array
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");//output:2 3 1 0 0 0 .
    }
}
}
=======
public class Moving0stoEnd {
public  static void moving0s(int arr[],int  n){
    int j=0;
for(int i=0;i<n;i++){
    if(arr[i]!=0){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j++;
    }
}
}   
public static void main(String[] args) {
    int arr[] = {2,0,3, 0, 1, 0};
    int n = arr.length;
    moving0s(arr,n);
    // Print sorted array
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");//output:2 3 1 0 0 0 .
    }
}
}
>>>>>>> 42431395506ee87a689add6ca2816f4187c61cb8
