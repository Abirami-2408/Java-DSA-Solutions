public class NextGreaterEle {
    public static void main(String[]args){
        int arr[]={4,5,2,25};
        for(int i=0;i<arr.length;i++){
int greater=-1;
for(int j=i+1;j<arr.length;j++){
if(arr[i]<arr[j]){
    greater=arr[j];
    break;
}
}
System.out.print(greater+" ");
        }
    }
}
