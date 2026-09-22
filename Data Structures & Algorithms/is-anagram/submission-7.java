class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> hash = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            hash.put(t.charAt(i), hash.getOrDefault(t.charAt(i), 0) + 1);
        }
        return map.equals(hash);

    }
}
