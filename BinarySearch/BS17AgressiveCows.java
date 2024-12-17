import java.util.Arrays;

public class BS17AgressiveCows {

    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};  // Example input
        int cows = 3;  // Number of cows
        BS17AgressiveCows obj = new BS17AgressiveCows();
        System.out.println("The largest minimum distance is: " + obj.agressiveCows(stalls, cows));
    }

    public boolean checkPossible(int arr[], int c, int minAllowed) {
        int cows = 1;  // First cow is placed at the first position
        int lastPosition = arr[0];
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] - lastPosition >= minAllowed) {
                cows++;
                lastPosition = arr[i];
            }
            if (cows >= c) {
                return true;  // Enough cows have been placed successfully
            }
        }
        return false;  // Not enough cows can be placed
    }

    public int agressiveCows(int arr[], int k) {
        Arrays.sort(arr);  // Sort the stall positions
        int start = 1;  // Minimum possible distance
        int ans = 0;
        int n = arr.length;

        int end = arr[n - 1] - arr[0];  // Maximum possible distance (search space)

        while (start <= end) {
            int mid = start + (end - start) / 2;  // Avoid integer overflow

            if (checkPossible(arr, k, mid)) {
                ans = mid;  // Store the current result
                start = mid + 1;  // Try for a larger distance
            } else {
                end = mid - 1;  // Try for a smaller distance
            }
        }
        return ans;
    }
}
