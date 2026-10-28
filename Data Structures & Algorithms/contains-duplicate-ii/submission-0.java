class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> seen = new HashMap<>();
        
        for(int j = 0; j < nums.length; j++) {
            int currentValue = nums[j];
            if(seen.containsKey(nums[j])) {
                int i = seen.get(currentValue);
            
                if(Math.abs(i - j) <= k) {
                    return true;
                }
            }
            seen.put(nums[j] , j);
            }
            return false;
        }
    }
