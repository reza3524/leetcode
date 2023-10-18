package string.validparentheses;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid(" "));
    }

    public static boolean isValid(String s) {
        if (s.trim().isEmpty()) {
            return false;
        }
       return true;
    }
}
