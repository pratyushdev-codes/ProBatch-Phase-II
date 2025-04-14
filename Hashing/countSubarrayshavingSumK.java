import java.util.HashMap;

public class countSubarrayshavingSumK {
    public static void main(String[] args) {
        
    }public int countSubarrays(int arr [], int k ){
        HashMap<Integer , Integer> prevSum = new HashMap<>();
        int curr_sum =0;int count = 0;
        
        prevSum.put(0,1);
        //calculate the sum that have to be removed
          //so that we can get the desired sum
          for(int i : arr){
            curr_sum += arr[i];
            int removeSum=curr_sum-k;


            if(prevSum.containsKey(removeSum)){
                count = count + prevSum.get(curr_sum);

                prevSum.put(curr_sum , prevSum.getOrDefault(curr_sum, 0)+1);
            }
return count;
        }

    

    }
}
