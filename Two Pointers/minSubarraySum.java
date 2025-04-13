public class minSubarraySum {
    public static void main(String[] args) {
        
    }  public int minSubArrayLen(int target, int[] nums) {
        int i =0;
        int j= nums.length-1;
        int sum =0;
        int length = Integer.MAX_VALUE;
        while(j<nums.length){
            sum= sum+nums[j];
            while(sum>= target){
                length= Math.min(length, j-i+1);
                
        
            }
        }

    }
    
}
