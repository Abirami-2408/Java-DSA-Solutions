class Majority_elements{
    public static int MajoritygreaterthanNby2(int arr[],int n){
        int cnt=0;int el=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;el=arr[i];
            }
            else if(arr[i]==el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==el) cnt++;    
        }
        if(cnt>n/3) return el;
        return -1;
    }
    public static void main(String[] args){
        int arr[]=new int []{2,2,3,3,2,2};
        int n=arr.length;
        int result=MajoritygreaterthanNby2(arr,n);
        System.out.println(result);//op:2

    }
}
   
