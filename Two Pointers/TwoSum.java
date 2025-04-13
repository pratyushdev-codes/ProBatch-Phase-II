import java.util.HashMap;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        


        //Brute force approach , we have to sort the array
    // }public int[] twoSum(int[] nums, int target) {
    //     int low = 0;
    //     int high = nums.length-1;
    //     int sum =0;
        
    //     nums.sort();

    //     sum= nums[low]+ nums[high];
    //     if(sum>target){
    //         high--;
    //     }else{
    //         low++;
    //     }

    // }
}public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> hm = new HashMap<>();

    for(int i =0;i<nums.length;i++){
        if(hm.containsKey(target-nums[i])){
            return new int[]{hm.get(target- nums[i]),i};

        }
        hm.put(nums[i],i);
    }

return new int[]{};





}
}
