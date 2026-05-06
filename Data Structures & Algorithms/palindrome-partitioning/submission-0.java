class Solution {
    List<List<String>> result = new ArrayList<>();
    List<String> list = new ArrayList<>();
    public List<List<String>> partition(String s) {
        dfs(s, 0);
        return result;
    }
    public void dfs(String s, int i) {
        if(i >= s.length()) {
            result.add(new ArrayList<>(list));
        }
        for(int j = i ; j < s.length() ; j++) {
            if(isPali(s, i, j)) {
                list.add(s.substring(i, j+1));
                dfs(s, j + 1);
                list.remove(list.size() - 1);
            }
        }
        
    }

    public boolean isPali(String s, int i, int j) {
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
