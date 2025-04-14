import java.util.HashMap;

public class Session4MeeshoOA {
    public static void main(String[] args) {
        // Given a string which consists of characters from "0" to "9", find the number of substrings
        // which contain character "5" -> "k" number of times.

        int k = 1; // The number of times '5' should appear
        String str = "00888005"; // Input string
        int n = str.length();

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1); // Base case: 0 occurrences of '5' initially

        int count = 0; // Tracks cumulative count of '5'
        int sum = 0; // Resultant count of substrings

        for (int i = 0; i < n; i++) {
            // Increment count if the current character is '5'
            if (str.charAt(i) == '5') {
                count++;
            }

            // Check if there is a prefix that leaves exactly `k` '5's in the substring
            sum += hm.getOrDefault(count - k, 0);

            // Update the count of cumulative '5's in the map
            hm.put(count, hm.getOrDefault(count, 0) + 1);
        }

        System.out.println("Number of substrings with '5' appearing " + k + " times: " + sum);
    }
}
