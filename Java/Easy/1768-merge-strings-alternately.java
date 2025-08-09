class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        String sb = "";
        int w1 = 0;
        int w2 = 0;

        while (w1 < word1.length() || w2 < word2.length()) {
            if (w1 < word1.length()) {
                sb += word1.charAt(w1);
                w1++;
            }
            if (w2 < word2.length()) {
                sb += word2.charAt(w2);
                w2++;
            }
        }
        return sb;
    }
}