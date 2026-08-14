class zohoPat{
 public static void func(int num){
    int tot=0;
    for(int i=1;i<=7;i++){
        int col=i;
        if(i>4) {
            col=2*num-i;}
         int n=tot+col;
        for(int j=1;j<=col;j++){
            System.out.print(n+" ");n--;
        }
        System.out.println();
        tot+=col;
    }
}

    public static void main(String[] args) {
        int num=4;
        func(num);
/*output is:
1
3 2
6 5 4
10 9 8 7
13 12 11
15 14
16 */
    }
}