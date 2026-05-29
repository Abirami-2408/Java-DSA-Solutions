class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
         for(int freq : map.values()){
            max = Math.max(max, freq);
        }

        int tot = 0;

        // Sum frequencies equal to max
        for(int freq : map.values()){
            if(freq == max){
                tot += freq;
            }
        }
        return tot;
    }
}