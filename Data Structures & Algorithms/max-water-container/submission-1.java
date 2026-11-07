class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int maxCapacity = 0;
        while(i<j) {
            int h = Math.min(heights[j],heights[i]);
            int w = j-i;
            int currentCapacity = w * h;
            maxCapacity = Math.max(currentCapacity, maxCapacity);
            if(heights[i]<heights[j]) {
                i++;
            } else if(heights[i]>heights[j]) {
                j--;
            } else{
                i++;
                j--;
            }
        }
        return maxCapacity;
    }
}
