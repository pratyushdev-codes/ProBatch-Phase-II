import java.util.HashMap;

public class ContinousSubarraySum {
    public static void main(String[] args) {
        
    }public static boolean continousSubarraySum(int [] arr , int K){
        HashMap <Integer, Integer> hm = new HashMap<>();
        int sum=0;
     
        for(int i =0;i<arr.length;i++){
          int num = arr[i];
          sum = sum+num;

           
            if(hm.containsKey(sum%K)){
                     if(hm.get(sum%k)<i){
                        return true;
                     }else{
                        hm.put(sum%K , i+1);
                     }
                
            }
            return false;

            
        }
    }
    
}
