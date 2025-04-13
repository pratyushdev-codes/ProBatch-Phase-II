import java.util.HashMap;

public class SubarraySumequalsK {
    public static void main(String[] args) {
        
    }  public int subarraySum(int[] nums, int k) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        int count =0;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum = sum+ i;

            if(hm.containsKey(sum-k)){
                count = count + hm.get(sum-k);

            }
           hm.put(sum , hm.getOrDefault(sum ,0  )+1);

        
        }
return count ;






    }
    
}
