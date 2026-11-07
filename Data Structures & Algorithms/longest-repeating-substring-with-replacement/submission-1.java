class Solution {
    public int characterReplacement(String s, int k) {
        char[] arr = new char[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        int maxf = 0;
        int l = 0;
        int res = 0;
    
        for(int r = 0; r < s.length(); r++) {
            maxf = Math.max(maxf, map.merge(s.charAt(r), 1, Integer :: sum));

            while((r-l+1) - maxf > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar)-1);
                l++;
            }
            res = Math.max(res, r-l+1);
        }
        return res;
    }
}
