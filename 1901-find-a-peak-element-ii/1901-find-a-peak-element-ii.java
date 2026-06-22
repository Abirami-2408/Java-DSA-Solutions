class Solution {
   int findMaxInd(int [][]mat,int m,int n,int col ){
        int maxValue=-1,index=-1;
        for(int i=0;i<m;i++){
            if(mat[i][col]>maxValue){
                maxValue=mat[i][col];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            int ansRow=findMaxInd(mat,m,n,mid);
            int left=mid-1>=0?mat[ansRow][mid-1]:-1;
            int right=mid+1<n?mat[ansRow][mid+1]:+1;
            if(mat[ansRow][mid]>left && mat[ansRow][mid]>right){
                return new int []{ansRow,mid};
            }
            else if(mat[ansRow][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[] {-1,-1};
    }
}