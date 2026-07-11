import java.util.ArrayList;
import java.util.List;

public class Unionof2sortedArray {
    static List <Integer>findUnion(int a[],int b[]){
        int i=0,j=0;
        List<Integer>ls=new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                if(ls.isEmpty() || ls.get(ls.size()-1)!=a[i]){
                    ls.add(a[i]);
                }
                i++;
            }
            else if(a[i]>b[j]){
                 if(ls.isEmpty() || ls.get(ls.size()-1)!=b[j]){
                    ls.add(b[j]);
                }
                j++;
            }
            else{
                 if(ls.isEmpty() || ls.get(ls.size()-1)!=a[i]){
                    ls.add(a[i]);
                }
                i++;
            }
        }
        while(i<a.length){
             if(ls.isEmpty() || ls.get(ls.size()-1)!=a[i]){
                    ls.add(a[i]);
                }
                i++;j++;
        }
         while(j<b.length){
             if(ls.isEmpty() || ls.get(ls.size()-1)!=b[j]){
                    ls.add(b[j]);
                }
                j++;
        }
        return ls;

    }
    public static void main(String args[]){
        int a[]={1,2,3,5};
        int b[]={2,3,4,8};
        List<Integer> answer=findUnion(a,b);
        System.out.println("Union"+ answer);//1,2,3,4,5,8
    }
}
