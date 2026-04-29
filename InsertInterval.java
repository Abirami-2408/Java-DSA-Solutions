import java.util.ArrayList;
import java.util.List;
public class InsertInterval {
    public static int[][]insert(int [][] intervals,int []newInterval){
       List<int[]> ls = new ArrayList<>();
        int n = intervals.length;
        int i = 0;
        // add intervals before overlap
        while (i < n && intervals[i][1] < newInterval[0]) {
            ls.add(intervals[i]);
            i++;
        }

        // merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        ls.add(newInterval);

        // add remaining intervals
        while (i < n) {
            ls.add(intervals[i]);
            i++;
        }

        return ls.toArray(new int[ls.size()][]);
    }
    public static void main(String args[]){
        int intervals[][]={{1,5}};
        int newInterval[]={5,7};
         int [][]res=insert(intervals,newInterval);
        for(int[]intervall:res){
            System.out.println(intervall[0]+" "+ intervall[1]);
        }
    }
}
