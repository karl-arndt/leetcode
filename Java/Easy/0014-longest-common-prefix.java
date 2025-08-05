class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        boolean isSameChar = false;
        for (int i = 0; i < strs.length; i++) {
            String temp = "";
            int j = 0;
            while (j < strs[i].length() && j < res.length()
                    && res.charAt(j) == strs[i].charAt(j)) {
                temp += strs[i].charAt(j);
                j++;
            }
            res = temp;
        }
        return res;
    }
}