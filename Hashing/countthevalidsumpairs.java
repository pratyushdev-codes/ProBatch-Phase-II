import java.util.HashMap;

public class countthevalidsumpairs {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>(); 
        int nums [] = {1929, 9219 , 29292 , 2929 };
        int target = 39289322;



        int count = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            int complement = target - nums[i];

            if(hm.containsKey(complement)){
                   count = hm.get(complement) + count;
            }
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
    
        }
    }

