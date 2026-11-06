class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> window = new HashSet<>();

        int l = 0;
        int longest = 0;

        for(int r = 0; r < s.length(); r++) {

            while(window.contains(s.charAt(r))) {
                window.remove(s.charAt(l));
                l++;
            }

            window.add(s.charAt(r));
            longest = Math.max(longest, (r - l + 1));
        }

        return longest;
    }
}
