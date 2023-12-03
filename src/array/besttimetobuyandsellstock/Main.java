package array.besttimetobuyandsellstock;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit2(new int[]{1, 2, 3, 4, 5}));
    }

    private static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for (int today : prices) {
            buy = Math.min(buy, today);
            profit = Math.max(profit, today - buy);
        }
        return profit;
    }

    private static int maxProfit2(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < prices[i]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
