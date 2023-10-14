package intergers.palindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int reverse = 0;
        int number = x;
        while (number > reverse) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return number == reverse /10 || number == reverse;
    }

    //Bad Solution
//    public boolean isPalindrome(int x) {
//        if (x == 0) {
//            return true;
//        }
//        char[] chars = String.valueOf(x).toCharArray();
//        if (chars[0] == '-') {
//            return false;
//        }
//        StringBuilder builder = new StringBuilder();
//        for (int i = chars.length - 1; i >= 0; i--) {
//            builder.append(chars[i]);
//        }
//        return builder.toString().equals(String.valueOf(x));
//    }
}
