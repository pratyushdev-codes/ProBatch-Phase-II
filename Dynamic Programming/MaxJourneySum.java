import java.util.Scanner;

public class MaxJourneySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size of the array
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        
        // Input the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Create dp array for memoization
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = Integer.MIN_VALUE; // Initialize dp array
        }
        
        // Call the function and print the result
        int result = countMaxSum(arr, 0, n, dp);
        System.out.println("Maximum Sum: " + result);
    }

    public static int countMaxSum(int[] arr, int i, int n, int[] dp) {
        // Base cases
        if (i >= n) return Integer.MIN_VALUE; // Out of bounds
        if (i == n - 1) return arr[i]; // Reached the last index

        // Use memoized result if already computed
        if (dp[i] != Integer.MIN_VALUE) {
            return dp[i];
        }

        // Recursive calculations for jumps of size 1, 3, and 5
        int jump1 = countMaxSum(arr, i + 1, n, dp);
        int jump3 = countMaxSum(arr, i + 3, n, dp);
        int jump5 = countMaxSum(arr, i + 5, n, dp);

        // Take the maximum of the possible paths and include the current index value
        dp[i] = arr[i] + Math.max(jump1, Math.max(jump3, jump5));
        return dp[i];
    }
}
