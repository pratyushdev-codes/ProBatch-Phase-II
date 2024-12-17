import java.util.*;

public class BS18MinPages {
    public static void main(String[] args) {
        int arr[] = {12, 34, 67, 90};
        int K = 2;
        int ans = findMax(arr, K);
        System.out.println(ans);
    }

    // Check if it's possible to assign books with the given page limit
    public static boolean check(int[] arr, int k, int pageLimit) {
        int cnt = 1; // Start with 1 student
        int pageSum = 0;

        for (int i = 0; i < arr.length; i++) {
            // If a single book exceeds the page limit, it's not possible
            if (arr[i] > pageLimit) return false;

            // Assign book to the next student if limit is exceeded
            if (pageSum + arr[i] > pageLimit) {
                cnt++;
                pageSum = arr[i];
            } else {
                pageSum += arr[i];
            }
        }
        return (cnt <= k);
    }

    // Binary search to find the minimum maximum page allocation
    public static int findMax(int arr[], int K) {
        if (K > arr.length) return -1;

        int start = Arrays.stream(arr).max().getAsInt(); // Max book size
        int end = Arrays.stream(arr).sum(); // Total pages
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (check(arr, K, mid)) {
                ans = mid; // Possible solution, try for a better (smaller) answer
                end = mid - 1;
            } else {
                start = mid + 1; // Increase the limit
            }
        }
        return ans;
    }
}
