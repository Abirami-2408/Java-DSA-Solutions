public class Remove_Dup {
    static int findDup(int arr[]){
        int n=arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
   public static void main(String args[]){
    int arr[]={1,1,2,2,3,3,4};
    int ans=findDup(arr);
    System.out.println("NO OF UNIQUE:"+ans);//4.
     for (int i = 0; i < ans; i++) {
        System.out.print(arr[i] + " ");//1,2,3,4
   } 
}
}
