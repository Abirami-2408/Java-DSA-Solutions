public class Elevatordistance {
    public static int elevatordis(int ar[]){
        int dis=0,dif=0;
        for(int i=0;i<ar.length-1;i++){
            dif=(ar[i]-ar[i+1]);
            if (dif<0) dif=-dif;
            dis+=dif;
        }
        return dis;
    }
    public static void main(String[] args) {
        int ar[]={5,2,8};
        int ans=elevatordis(ar);
        System.out.println(ans);//(5-2=3,2-8=6,total is 6+3=9)
    }
}
