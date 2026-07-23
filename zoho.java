public class zoho {
  
public static void pat(int n){
   
    for(int i=1;i<=n;i++){
        int cur=i; int gap=n-1;
        for(int j=0;j<i;j++){
            System.out.print(cur +" ");
            cur=cur+gap; gap--;
        } 
       
        System.out.println();
    }
}
public static void main(String[]args){
    int n=5;
    pat(n);/*1
2 6
3 7 10
4 8 11 13
5 9 12 14 15*/
}
}

