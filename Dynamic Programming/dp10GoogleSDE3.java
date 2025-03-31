import java.util.Arrays;

public class dp10GoogleSDE3 {
    public static void main(String[] args) {
        
    }    public static int minCost(int n, int y, int x, int z, int b) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0; // Cost to reduce 1 to 1 is 0

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + y; // Reduce by 1
            if (i % 7 == 0) dp[i] = Math.min(dp[i], dp[i / 7] + x); // Reduce by /7
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + z); // Reduce by /3
            if (i % 5 == 0) dp[i] = Math.min(dp[i], dp[i / 5] + b); // Reduce by /5
        }

        return dp[n];
    }
}
