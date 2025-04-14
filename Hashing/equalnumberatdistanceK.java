import java.util.*;

public class equalnumberatdistanceK {
    public static void main(String[] args) {
     int[] nums = {1, 1, 3, 1, 2, 3};
     int k = 2;
    }public static boolean findNumber(int nums [], int k ){
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i = 0 ; i< nums.length ; i++){
            if(hm.containsKey(nums[i]) && i- hm.get(nums[i])<=k){
                return true;
            }

            hm.put(nums[i], i);
                
            
        }    return false;
    
    }


}




