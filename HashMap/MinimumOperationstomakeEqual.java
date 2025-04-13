import java.util.HashMap;
import java.util.Set;

public class MinimumOperationstomakeEqual {
    public static void main(String[] args) {
        
    }public static int minOperator(int arr [], int n ){
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int i =0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]+1));
            }else{
                hm.put(arr[i],1);
            }
        

           }    int maxCount=0;
           Set<Integer> s = hm.keySet();
           for(int i =0;i<n;i++){
            if(maxCount<hm.get(i)){
                maxCount=hm.get(i);
            }



        }
        return (n-maxCount);
    }
    

}