import java.util.HashMap;

public class subarraywithsumK {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10};
        int k = 5;

    }public static int countSubarraySumK(int arr , int k ){


        HashMap < Integer, Integer> hm = new HashMap<>();

        int sum = 0; 
        int count = 0 ;


        hm.put(0 ,1);
        for(int num: arr){
            sum += num;
        }

        if(hm.containsKey(sum -k)){
            count += hm.get(sum - k);
        }
        hm.put(sum , hm.getOrDefault(sum, 0)+1);
        return count;
    } 
   
}
