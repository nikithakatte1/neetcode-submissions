class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> temp = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            map.merge(nums[i], 1, Integer::sum);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            temp.add(new int[] {entry.getValue(), entry.getKey()});
        }
        temp.sort((a, b) -> b[0] - a[0]);
        
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = temp.get(i)[1];
        }
        return res;
    }
}
