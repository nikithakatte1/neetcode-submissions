class Solution {
    public int largestUniqueNumber(int[] nums) {
        int maximumKey = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i] , 0) + 1);
            }
            for(Map.Entry<Integer, Integer> i : map.entrySet()) {
                Integer key = i.getKey();
                Integer value = i.getValue();
                
                if(value == 1){
                    maximumKey = Math.max(key, maximumKey); 
                }
            } 
            return maximumKey;
        }
    }

