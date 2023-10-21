package string.decodestring;

public class Main {
    public static void main(String[] args) {
        System.out.println(decodeString("100[leetcode]"));
    }

    public static String decodeString(String s) {
        int open = s.lastIndexOf('[');
        int close = s.indexOf(']', open);
        if (open < 0 || close < 0) {
            return s;
        }

        int index = open - 1;
        while (Character.isDigit(s.charAt(index)) && index > 0) {
            index -= 1;
        }
        index = index == 0 ? index : index + 1;
        int counter = Integer.parseInt(s.substring(index, open));
        String total = s.substring(index, close + 1);
        String valid = s.substring(open + 1, close);
        s = s.replace(total, valid.repeat(counter));

        return decodeString(s);
    }
}
