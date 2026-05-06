class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        HashMap<String, List<String>> hash = new HashMap<>();

        for(String str : strs) {
            int[] count = new int[26];
            for(char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            hash.putIfAbsent(key, new ArrayList<>());
            hash.get(key).add(str);

        }
        return new ArrayList<>(hash.values());

    }
}
