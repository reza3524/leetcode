package string.reverse;

public class Main {

    public static void main(String[] args) {
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o', 'w'});
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            right -= 1;
            left += 1;
        }
        System.out.println(s);
    }
}
