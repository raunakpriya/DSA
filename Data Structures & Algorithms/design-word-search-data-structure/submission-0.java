class WordDictionary {
    List<String> dict;
    public WordDictionary() {
        dict = new ArrayList<>();
    }

    public void addWord(String word) {
        dict.add(word);
    }

    public boolean search(String word) {
        for(String w : dict) {
            if(w.length() != word.length()) {
                continue;
            }
            int i = 0;
            while(i < w.length()) {
                if(w.charAt(i) == word.charAt(i) || word.charAt(i) == '.') {
                    i++;
                } else {
                    break;
                }
            }
            if(i == w.length()) {
                return true;
            }
        }
        return false;
    }
}
