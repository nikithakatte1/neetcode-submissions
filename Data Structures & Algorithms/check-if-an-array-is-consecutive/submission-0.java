class Solution {
    public boolean isConsecutive(int[] nums) {
        int minValue = nums[0];
        int maxValue = nums[0];
        Set<Integer> set = new HashSet<>();

        for(int i : nums) {
            if (!set.add(i))
                return false;
            minValue = Math.min(i, minValue);
            maxValue = Math.max(i, maxValue);
        }
        return maxValue-minValue+1==nums.length;
    

        

    }
    
}
