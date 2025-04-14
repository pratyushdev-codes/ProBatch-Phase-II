import java.util.HashMap;
import java.util.Scanner;

public class t17AmazonOA {

    // Function to count subarrays with at most `maxDistinct` distinct elements
    static long countSubarraysWithMaxDistinct(long[] array, long n, long maxDistinct) {
        long start = 1;
        long end = 1;
        long subarrayCount = 0;
        HashMap<Long, Long> frequencyMap = new HashMap<>();
        frequencyMap.put(array[1], 1L);

        while (end <= n) {
            long distinctCount = frequencyMap.size();
            if (distinctCount <= maxDistinct) {
                // Add subarrays ending at `end` and starting from each index `start` to `end`
                long windowSize = end - start + 1;
                subarrayCount += windowSize;
                end++;
                if (end <= n) {
                    frequencyMap.put(array[(int) end], frequencyMap.getOrDefault(array[(int) end], 0L) + 1);
                }
            } else {
                // Shrink the window by moving `start` to the right
                frequencyMap.put(array[(int) start], frequencyMap.get(array[(int) start]) - 1);
                if (frequencyMap.get(array[(int) start]) == 0) {
                    frequencyMap.remove(array[(int) start]);
                }
                start++;
            }
        }
        return subarrayCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(); // Size of the array
        long[] array = new long[(int) (n + 1)];

        // Read input array (1-based indexing)
        for (int i = 1; i <= n; i++) {
            array[i] = scanner.nextLong();
        }

        long totalSubarrays = n * (n + 1) / 2; // Total subarrays in the array
        long halfSubarrays = (totalSubarrays + 1) / 2; // Half of the subarrays, rounded up
        long result = 0;
        long low = 1, high = n;

        // Binary search to find the smallest `r` such that at least half of the subarrays
        // have at most `r` distinct elements
        while (low <= high) {
            long mid = (low + high) / 2;

            // Check the number of subarrays with at most `mid` and `mid + 1` distinct elements
            long currentCount = countSubarraysWithMaxDistinct(array, n, mid);
            long nextCount = countSubarraysWithMaxDistinct(array, n, mid + 1);

            if (currentCount < halfSubarrays && nextCount >= halfSubarrays) {
                result = mid + 1;
                break;
            } else if (currentCount >= halfSubarrays) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Output the result
        System.out.println(result);
    }
}
