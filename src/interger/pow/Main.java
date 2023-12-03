package interger.pow;

public class Main {
    public static void main(String[] args) {
        System.out.println(myPow(3, 3));
    }

    public static double myPow(double x, int n) {
        double answer = 1.0;
        long number = n;
        if (n < 0) {
            number = -1 * number;
        }
        while (number > 0) {
            if (number % 2 == 0) {
                x *= x;
                number /= 2;
            } else {
                answer *= x;
                number -= 1;
            }
        }
        if (n < 0) {
            return (1.0) / answer;
        }
        return answer;
    }
}
