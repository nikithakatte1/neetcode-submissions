class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> res = new ArrayList<>();

       for(int n = 0; n < numRows; n++) {

        List<Integer> row = new ArrayList<>();
        row.add(1);
        int val = 1;
        for(int i = 1; i <= n; i++) {
            val = val * (n - i +1) /i;
            row.add(val);
        }
        res.add(row);
       }
       return res; 
    }
}