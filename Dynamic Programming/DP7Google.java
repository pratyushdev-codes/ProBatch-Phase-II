import java.util.*;

public class DP7Google {
    public static void main(String[] args) {
        int arr[] = {5, 8, 3, 100, -5, -5, 5, 10};
        int n = arr.length;
        int dp[] = new int[n]; // DP array of size n
        Arrays.fill(dp, Integer.MIN_VALUE); // Fill dp with very small values
        
        // Base case: Start the journey from index 0
        dp[0] = arr[0];
        
        // Fill the dp array iteratively
        for (int i = 1; i < n; i++) {
            // Check jumps of size 1, 3, and 5 from previous valid indices
            if (i - 1 >= 0) dp[i] = Math.max(dp[i], dp[i - 1] + arr[i]);
            if (i - 3 >= 0) dp[i] = Math.max(dp[i], dp[i - 3] + arr[i]);
            if (i - 5 >= 0) dp[i] = Math.max(dp[i], dp[i - 5] + arr[i]);
        }
        
        // The answer is stored at dp[n-1]
        System.out.println(dp[n - 1]);
    }
}
