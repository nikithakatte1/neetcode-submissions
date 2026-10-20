class Solution {
    public int sumOfDigits(int[] nums) {
        int minValue = nums[0];
        int sum = 0;

        for(int i = 0; i <nums.length; i++) {
            minValue = Math.min(nums[i], minValue);
        }
        while(minValue>0){
        sum += minValue%10;
        minValue/= 10;
        }
        return 1-sum%2;
    }
    
}
