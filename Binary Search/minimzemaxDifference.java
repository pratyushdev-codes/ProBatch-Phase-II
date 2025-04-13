import java.util.Arrays;
import java.util.function.Function;

public class minimzemaxDifference {
    
} class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length, l = 0, r = nums[n-1]-nums[0], ans = Integer.MAX_VALUE;

        // Function to check if there are atleast p pairs possible whose difference <= maxDiff
        Function<Integer, Boolean> isPossible = (maxDiff)->{
            int cnt = 0;
            for(int i=0; i<nums.length-1; i++){
                if( Math.abs(nums[i]-nums[i+1]) <= maxDiff ){
                    cnt++;
                    i++;
                }
            }
            return cnt >= p ;
        };

        while( l<=r ){
            int mid = (l+r)>>1;
            if( isPossible.apply(mid) ){
                ans = mid;
                r = mid-1;
            }else l = mid+1;
        }
        return ans;
    }
}
