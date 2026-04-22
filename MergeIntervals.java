import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MergeIntervals {
    public static int[][] merge(int arr[][]){
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>answer=new ArrayList<>();
        for(int[]a:arr){
            if(answer.isEmpty() || answer.get(answer.size()-1)[1]<a[0]){
                answer.add(a);
            }
            else{
                answer.get(answer.size()-1)[1]=Math.max(answer.get(answer.size()-1)[1],a[1]);
            }
        }

        return answer.toArray(new int[answer.size()][]);//output:[1 5 ],[8 9]
    }
    public static void main(String args[]){
        int[][]arr={{1,2},{1,3},{8,9},{3,5}};
        int [][]res=merge(arr);
        for(int[]interval:res){
            System.out.println(interval[0]+" "+ interval[1]);
        }
        
    }
}
