import java.util.HashMap;

public class CountNumbersofPairsAbsoluteDifferenceK{
    public static void main(String[] args) {
        
    } public static int countnumberofpairsabsoluteDifferenceK(int arr[], int k){


        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        
        for(int i =0;i<arr.length;i++){
            if (hm.containsKey(k-arr[i])){
                count = count +hm.get(k-arr[i]);
            }
            if(hm.containsKey(k+arr[i])){
                count = count + hm.get(k+arr[i]);

        
        }
        hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }


return count;
    }

}