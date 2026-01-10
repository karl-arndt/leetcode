class ScoreOfAString {
    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int temp = s.charAt(i + 1) - s.charAt(i);
            if (temp < 0) {
                temp *= -1;
            }
            score += temp;
        }
        return score;
    }
}