import java.util.HashSet;
class  LongestConsecutiveSequence {
    public static int LongestConsectiveSeq (int arr[],int n){
        HashSet <Integer>set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }      
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){//num-1 ensures that it is beginning
                int currentNum=num;
               int  count=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
public static void main(String[] args) {
    int arr[] = {102,4,100,1,101,3,2,1,1};
    int n = arr.length;
   int result = LongestConsectiveSeq(arr, n);
        System.out.println("Maximum Length: " + result); //Maximum Sum: 4[1,2,3,4]
    }
}

   
