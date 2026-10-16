class Solution {
    public String stringShift(String s, int[][] shift) {
        int n = s.length();

        for(int[] i : shift){
            int direction = i[0];
            int amount = i[1]%n;
            if( direction == 0){
                    s = s.substring(amount) + s.substring(0, amount);
                } else {
                    s = s.substring(n-amount) + s.substring(0, n-amount); 
                }
            } 
        return s;
    }
    
}
