package intergers.trailingzeroes;

public class Main {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(250));
    }

    public static int trailingZeroes(int n) {
//        n/5 + n/25 + n/125 + n/625 + ... -> till result == 0 then sum all result
        int counter = 5;
        int result = 0;
        while (n / counter != 0) {
            result = result + n / counter;
            counter *= 5;
        }
        return result;
    }
}
