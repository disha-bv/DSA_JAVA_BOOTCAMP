package DAY12.SESSION2;
import java.util.Scanner;

public class BudgetShoppingCart {

    // Function to find maximum satisfaction
    public static int maxSatisfaction(int[] prices, int[] scores, int budget) {

        // dp[w] stores the maximum satisfaction
        // possible with budget w
        int[] dp = new int[budget + 1];

        // Process each item
        for (int i = 0; i < prices.length; i++) {

            int price = prices[i];
            int score = scores[i];

            // Traverse from right to left
            // because each item can be selected only once
            for (int w = budget; w >= price; w--) {

                // Maximum of:
                // 1. Not selecting the current item
                // 2. Selecting the current item
                dp[w] = Math.max(
                    dp[w],
                    dp[w - price] + score
                );
            }
        }

        return dp[budget];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of items
        int N = sc.nextInt();

        // Input prices
        int[] prices = new int[N];

        for (int i = 0; i < N; i++) {
            prices[i] = sc.nextInt();
        }

        // Input scores
        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }

        // Input budget
        int W = sc.nextInt();

        // Find maximum satisfaction
        int result = maxSatisfaction(prices, scores, W);

        // Print answer
        System.out.println(result);

        sc.close();
    }
}