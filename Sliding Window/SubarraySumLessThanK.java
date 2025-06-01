public class SubarraySumLessThanK {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6};
        int K = 10;

        int count = 0; // Total count of subarrays
        int currentSum = 0; // Sum of the current window
        int left = 0; // Left pointer of the window

        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right]; // Expand the window to the right

            // Shrink the window from the left if currentSum exceeds K
            while (currentSum > K) {
                currentSum -= arr[left];
                left++;
            }

            // At this point, currentSum <= K.
            // All subarrays ending at 'right' and starting from 'left' up to 'right'
            // are valid. The number of such subarrays is (right - left + 1).
            count += (right - left + 1);
        }
        System.out.println("Number of subarrays with sum less than or equal to " + K + ": " + count);
    }
}