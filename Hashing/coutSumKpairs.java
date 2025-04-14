import java.util.HashMap;

public class coutSumKpairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 10;
    }public boolean checkPair(int arr [], int k){

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            if(hm.containsKey(k- arr[i])){
                return true;
            }
            hm.put(arr[i], i);
        }
            return false;
        }

    }

