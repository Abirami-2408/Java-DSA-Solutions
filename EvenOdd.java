import java.util.ArrayList;
import java.util.Arrays;

public class EvenOdd {
    public static int [] separate(int arr[]){
    ArrayList<Integer> even=new ArrayList<>();
      ArrayList<Integer> odd=new ArrayList<>();
    int n=arr.length;
    for(int i=0;i<n;i++){
        if(arr[i]%2==0){
           even.add(arr[i]);
        }
        else{
           odd.add(arr[i]);
        }
    }
    int e=0,o=0; int ans[]=new int[n];
   
int k=0;
    
    // for even and odd
    while(e<even.size()){
         ans[k++]=even.get(e++);
    }
    while(o<odd.size()){
         ans[k++]=odd.get(o++);
    }

    return ans;
    }
    public static void main(String args[]){
        int []arr={1,2,3,4,15,16};
       System.out.println(Arrays.toString(separate(arr)));

    }
}
