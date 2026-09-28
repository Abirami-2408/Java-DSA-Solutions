public class Merge {
    
    public static int[] merge(int arr1,int arr2,int m,int n){
        int l=0,r=0,ind=0;
        int[] ar3=new int[m+n];
while(l<m && r<n){
    if(arr1[l]<=arr2[r]){
        ar3[ind++]=arr1[l++];
    }
    else ar3[ind++]=arr1[r++];
}
while ((l<m)) {
    ar3[ind++]=arr1[l++];
}
while(r<n){
    ar3[ind++]=arr1[r++];
}
for(int i=0;i<m+n;i++){
    if(i<n){

arr1[i]=ar3[i];
else{
    arr2[i-n]=ar3[i];
}    }
    
}

}
  public static void main(String args[]){
        int[]arr1={1,4,11,17};
        int []arr2={13,8,5};
        int m=arr1.length,n=arr2.length;
        int []res=merge(arr1,arr2,m,n);//[1,4,5,8,11,13,17]
        System.out.println(res);
  }
}
