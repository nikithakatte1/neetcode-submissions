class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int sum = 0;
        int total = 0;
        for (int i = 0; i < k; i++) {
            sum += calories[i];
        }

        if (sum > upper) {
            total += 1;
        } else if (sum < lower) {
            total -= 1;
        }

        for ( int right = k ; right < calories.length; right++) {
            sum = sum - calories[right-k] + calories[right];
            if(sum > upper) {
                total += 1;
            }
            else if(sum < lower) {
                total -= 1;
            }

        }
        return total;
    }
}
