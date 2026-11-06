class Solution {
    public int longestConsecutive(int[] nums) {
        int cnt=0;
        int n=nums.length;
        int longest=0;
        HashSet<Integer>ans=new HashSet<>();
        for(int a:nums){
            ans.add(a);
        }
        for(int num:ans){
            if(!ans.contains(num-1)){
                int curr=num;
                 cnt=1;
            
                while(ans.contains(curr+1)){
                    curr=curr+1;
                    cnt+=1;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
        }
        
        
    }
