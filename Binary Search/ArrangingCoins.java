public class ArrangingCoins {
    public static void main(String[] args) {
        
    } class Solution {
        public int arrangeCoins(int n) {
             int start = 0;
             int end = n;
              while (start <= end) {
                 int mid = start + (end - start) / 2;
     
                 if (mid * (mid + 1) / 2 < n) {
                     start = mid + 1;
                 } else if (mid * (mid + 1) / 2 > n) {
                     end = mid - 1;
                 } else {
                     return mid;
                 }
              }
              return end; // return end if no exact match found
         }
     }
     

    }