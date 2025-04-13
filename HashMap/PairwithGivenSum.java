import java.util.HashMap;

public class PairwithGivenSum {
    public static void main(String[] args) {
        
    }public static int pairwithGivenSum(int arr[], int k , int n){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count =0;
        for(int i =0;i<n;i++){
            if(hm.containsKey(k-arr[i])){
                count = count + hm.get(k-arr[i]);
        }if(hm.containsKey(arr[i])){
            hm.put(arr[i], hm.get(arr[i])+1);
        }else{
            hm.put(arr[i],1);
        }
     
    }
    return count;

    
}
}