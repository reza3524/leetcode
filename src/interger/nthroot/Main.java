package interger.nthroot;

public class Main {
    public static void main(String[] args) {
        System.out.println(nthRoot(27, 3));
    }

    public static double nthRoot(double x, int n) {
        double left = 1;
        double right = x;
        double error = 0.001;
        while ((right - left) > error) {
            double middle = (left + right) / 2.0;
            if (getResultMiddle(n, middle) > x) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return left;
    }

    private static double getResultMiddle(int n, double middle) {
        double resultMiddle = 1.0;
        for (int i = 1; i <= n; i++) {
            resultMiddle *= middle;
        }
        return resultMiddle;
    }
}
