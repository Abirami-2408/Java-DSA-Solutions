class Solution {
public void merge(int[] nums1, int m, int[] nums2, int n) {
    for(int i=0;i<n;i++){
        if(m==0) nums1[i]=nums2[i];
    }
    int l=m-1,r=0;
    while(l>=0 && r<n){
        if(nums1[l]>nums2[r]){
            int temp=nums1[l];
            nums1[l]=nums2[r];
            nums2[r]=temp;
            l--;r++;
        }
        else break;
    }
    Arrays.sort(nums1,0,m);Arrays.sort(nums2);
    for(int i=0;i<n;i++){
        nums1[m+i]=nums2[i];
    }



   

}

}
