class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;

        HashSet<Character> hash = new HashSet<>();

        while(end < s.length()) {
            char ch = s.charAt(end);
            if(!hash.contains(ch)) {
                hash.add(ch);
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            } else {
                hash.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}
