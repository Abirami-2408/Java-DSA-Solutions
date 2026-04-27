import java.util.ArrayList;
import java.util.List;
public class MajorityElement3 {
    public  static List<Integer> majorityelements(int arr[],int n){
        int cnt1=0,cnt2=0;int el1=0,el2=0;
        for(int i=0;i<n;i++){
            if(cnt1==0 && arr[i]!=el2) {
                el1=arr[i]; cnt1++;
            }
              else if(cnt2==0 && arr[i]!=el1) {
                el2=arr[i]; cnt2++;
            }
            else if(arr[i]==el1) cnt1++;
             else if(arr[i]==el2) cnt2++;
              else {
                cnt1--;
                cnt2--;
            }
             
        }
        cnt1=0;cnt2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==el1) cnt1++;
            else if(arr[i]==el2) cnt2++;
        }
        List<Integer>ls=new ArrayList<>();
        if(cnt1>n/3)ls.add(el1);
        if(cnt2>n/3) ls.add(el2);
        return ls;
    }
    
    public static void main(String args[]){
        int []arr={1,1,1,3,3,2,2,2};
        int n=8;
        System.out.println(majorityelements(arr,n));

    }
}
