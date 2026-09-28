public class Sumofarr {
   
  public static int sum(int arr[], int n) {
        int sum=0;
       for(int a:arr){
        sum+=a;
       }
     return sum;
    }
public static void main(String[] args) {
    int n=5;
    int arr[] ={1,2,3,4,5};//Output: 15
    System.out.print(sum(arr,n));
}
}
