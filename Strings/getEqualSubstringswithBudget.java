
// 1208. Get Equal Substrings Within Budget
// Medium
// Topics
// Companies
// Hint
// You are given two strings s and t of the same length and an integer maxCost.

// You want to change s to t. Changing the ith character of s to ith character of t costs |s[i] - t[i]| (i.e., the absolute difference between the ASCII values of the characters).

// Return the maximum length of a substring of s that can be changed to be the same as the corresponding substring of t with a cost less than or equal to maxCost. If there is no substring from s that can be changed to its corresponding substring from t, return 0.


public class getEqualSubstringswithBudget {

    public static void main(String[] args) {
    }public int equalSubstring(String s, String t, int maxCost) {
          
        int head =0, tail =0, cost =0, ans =0;
         for(int i=0; i<s.length();i++){
            cost = cost+ Math.abs(s.charAt(head) - t.charAt(head));
            while(cost>maxCost){
                cost = cost - Math.abs(s.charAt(tail) - t.charAt(tail));
                tail++;
            }
            ans = Math.max(ans, head-tail+1);
         }
return ans;


        }
    }
    