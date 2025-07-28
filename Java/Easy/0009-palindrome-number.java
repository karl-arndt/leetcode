class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = x % 10;
        int temp = x / 10;
        while (temp > 0) {
            y *= 10;
            y += (temp % 10);
            temp /= 10;
        }
        return x == y;
    }
}