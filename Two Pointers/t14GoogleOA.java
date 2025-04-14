public class t14GoogleOA {
    public static void main(String[] args) {
        int nums [] = {1, 2, 3, 4, 5, 6,9};
        int limit = 10;
        int i  = 0 ;
        int j = 0;

        int diff = 0;
        int n = nums.length;

      
    }public int longestSubarray(int[] a, int k) {
        int i = 0, j = 0;
        int n = a.length;
        int diff = 0, ans = 0;
        while (i < n && j < n) {
            if (i == j) {
                ans = Math.max(1, ans);
                j++;
                if (j < n) diff = a[j] - a[i];
            } else {
                if (diff > k) {
                    // [i...j-1]
                    i++;
                    j--;
                    if (i > j) j = i;
                    diff = a[j] - a[i];
                } else {
                    ans = Math.max(ans, Math.abs(j - i) + 1);
                    j++;
                    if (j < n) diff = a[j] - a[i];
                }
            }
        }
        return ans;
    }
}