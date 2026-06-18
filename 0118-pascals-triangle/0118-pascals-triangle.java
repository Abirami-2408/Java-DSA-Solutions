class Solution {
    public List<Integer>generateRows(int rows){
        List<Integer>result=new ArrayList<>();
        long ans = 1;
		result.add((int)ans);
		for (int col = 1; col<rows; col++) {
			ans = ans*(rows - col);
			ans = ans/col;
			result.add((int)ans);
			
		}
		return result;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>res=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            res.add(generateRows(i));
        }
        return res;
    }
}