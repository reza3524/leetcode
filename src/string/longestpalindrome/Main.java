package string.longestpalindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }

    static int start = 0;
    static int end = 0;
    public static String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            handlePalindrome(s, i, i);
            handlePalindrome(s, i, i + 1);
        }
        return s.substring(start, end + 1);
    }

    private static void handlePalindrome(String string, int left, int right) {
        while (left >= 0 && right < string.length() && string.charAt(left) == string.charAt(right)) {
            left -= 1;
            right += 1;
        }
        left += 1;
        right -= 1;
        if (end - start < right - left) {
            end = right;
            start = left;
        }
    }
}
