class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> set = new HashSet<>();

      for(int i:nums){
        if(!set.add(i)){
          return true;
        }
      }
      return false;
      

    //   for(int i=0;i<nums.length-1;i++) {
    //     for(int j=i+1; j<nums.length ;j++){
    //         if(nums[i] == nums[j]){
    //             return true;
    //         }
    //     }

    //   }
       //return false;
     }
}