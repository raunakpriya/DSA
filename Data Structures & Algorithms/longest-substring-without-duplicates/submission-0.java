class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;

        for(int i = 0 ; i < s.length() ; i++) {
            if(map.containsKey(s.charAt(i))) {
                start = Math.max(start, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            count = Math.max(count, i - start + 1);

        }
        return count;
    }
}
