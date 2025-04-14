import java.util.HashMap;

public class longestSubarraywith0Sum {
    public static void main(String[] args) {
        
    }public int countSubarray(int nums[]){
        int longest = Integer.MIN_VALUE;

        HashMap< Integer, Integer> preSum = new HashMap<>();
          int sum = Integer.MAX_VALUE;
          int max_len = 0 ;
        for(int i : nums){
            sum = sum + nums[i];
            if(sum == 0){
                max_len = i+ 1;
            }

            if(preSum.containsKey(sum)){
                max_len =Math.max(max_len , i - preSum.get(sum));
            }else{
                preSum.put(sum , i);
            }
        }

         return max_len;

    }
}
