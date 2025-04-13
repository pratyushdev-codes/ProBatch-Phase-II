public class SubarrayProductlessthanK{
    public static void main(String[] args) {
        
    }public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        if (k <= 1) {       
            return 0;
        }

        int left = 0;
        int ans = 0;
        int currProduct = 1;


        for (int right = 0; right < nums.length; right++) {
            currProduct *= nums[right];

            while (currProduct >= k) {
                currProduct /= nums[left];
                left++;
            }

            ans += right - left + 1;
        }

        return ans;

    }
}