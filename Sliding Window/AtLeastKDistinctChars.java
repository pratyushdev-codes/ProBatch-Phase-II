import java.util.HashMap;
// Expand the window by incrementing j and adding characters to the map.
// If the size of the map (map.size()) meets or exceeds k, calculate the number of substrings from the current window and move i (to shrink the window).
public class AtLeastKDistinctChars {
    public static void atleastKDistinctChars(String s, int k) {
        int i = 0, j = 0;
        int n = s.length();
        int ans = 0; // Count of substrings with at least k distinct characters
        HashMap<Character, Integer> map = new HashMap<>(); // To store the frequency of characters

        while (j < n) {
            // Add the current character to the map and increment its frequency
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            j++;

            // Check if the condition (at least k distinct characters) is met
            while (i <= j && map.size() >= k) {
                // Calculate the number of substrings ending at 'j - 1' that satisfy the condition
                ans += n - j + 1;

                // Remove the character at index 'i' from the map
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if (map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                }
                i++;
            }
        }

        System.out.println(ans); // Print the result
    }

    public static void main(String[] args) {
        String s = "abccd";
        int k = 3;
        atleastKDistinctChars(s, k);
    }
}
