public class dpSumofArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5}; // Example array
        int[] dp = new int[nums.length];
        findArraySum(nums, dp);
        
        // Print the cumulative sum
        for (int sum : dp) {
            System.out.print(sum + " ");
        }
    }

    public static void findArraySum(int[] nums, int[] dp) {
        if (nums.length == 0) {
            return; // Handle empty array case
        }
        
        dp[0] = nums[0]; // Base case: first element
        
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + dp[i - 1]; // Calculate cumulative sum
        }
    }
}
