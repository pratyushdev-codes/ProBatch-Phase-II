import java.util.*;
public class ReplacetheSubstringforbalancedString {
    public static void main(String[] args) {
        
    }public int balancedString(String s) {
        int left =0;
        int length = s.length(); 
        int targetCount = length/4;
        int ans = length;
        Map<Character, Integer> charCount = new HashMap<>();


        for(char c = 0 ; c<length;c++){
            charCount.put(c, charCount.getOrDefault(c, 0)+1);
        }


        for(int right =0; right<s.length();right++) {
            charCount.put(s.charAt(right), charCount.get(s.charAt(right)) - 1);

            // Shrink the window by moving the left pointer
            while (left < length && charCount.get('Q') <= targetCount && charCount.get('W') <= targetCount &&
                   charCount.get('E') <= targetCount && charCount.get('R') <= targetCount) {
                // Update the answer
                ans = Math.min(ans, right - left + 1);
                // Increment the count of the character at the left pointer
                charCount.put(s.charAt(left), charCount.get(s.charAt(left)) + 1);
                // Move the left pointer
                left++;
            }
        }

        return ans;
    }
}