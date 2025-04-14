import java.util.HashMap;

public class LongestSubarraySum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, -1, -4};
        int k = 9;

        LongestSubarraySum obj = new LongestSubarraySum();
        int length = obj.findLargest(nums, k);
        System.out.println("Length of the longest subarray with sum " + k + " is: " + length);
    }

    public int findLargest(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int sum = 0;
        int max = 0; // Initialize max to 0 for subarray length.

        // Iterate through the array.
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If the sum equals k, update max length.
            if (sum == k) {
                max = i + 1;
            }

            // If (sum - k) exists in the map, calculate the subarray length.
            if (hm.containsKey(sum - k)) {
                max = Math.max(max, i - hm.get(sum - k));
            }

            // Store the first occurrence of the sum in the map.
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
        }

        return max;
    }
}
