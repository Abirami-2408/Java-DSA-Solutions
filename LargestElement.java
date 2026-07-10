public class LargestElement {
    static int findLarge(int[] arr){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;//5
    }
    static int findSec_Large(int[] arr){
        int largest=arr[0],sec_large=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                
                sec_large=largest;largest=arr[i];
            }
            else if((arr[i]<largest) && (arr[i]>sec_large )){
                sec_large=arr[i];
            }
        }
        return sec_large;//4
    }

    
    public static void main(String args[]){
         int arr[] = {2,3,4,1,5};
         System.out.println(findLarge(arr));
         System.out.println(findSec_Large(arr));
         
    }
}
