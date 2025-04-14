import java.util.HashMap;

public class AmazonOA09 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 7, 7, 4, 3, 6};
        int k = 3; // window size
        int n = arr.length;
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> hm = new HashMap<>();

        while (j < n) {
            // Add the current element to the sum and HashMap
            sum += arr[j];
            hm.put(arr[j], hm.getOrDefault(arr[j], 0) + 1);

            // Check if the window size is reached
            if (j - i + 1 == k) {
                // Check if all elements in the window are distinct
                if (hm.size() == k) {
                    max = Math.max(max, sum);
                }

                // Slide the window
                sum -= arr[i];
                if (hm.get(arr[i]) == 1) {
                    hm.remove(arr[i]);
                } else {
                    hm.put(arr[i], hm.get(arr[i]) - 1);
                }
                i++;
            }
            j++;
        }

        System.out.println(max);
    }
}
