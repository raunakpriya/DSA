class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;

        int start = 0;
        int freq = 0;

        for(int i = 0 ; i < s.length() ; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i) , 0) + 1);

            freq = Math.max(freq, map.get(s.charAt(i)));

            while((i - start + 1) - freq > k) {
                map.put(s.charAt(start), map.get(s.charAt(start)) - 1);
                start++;
            }
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}
