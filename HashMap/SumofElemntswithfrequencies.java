// Sum of elements in an array with frequencies greater than or equal to that element

import java.util.HashMap;

public class SumofElemntswithfrequencies {
    public static void main(String[] args) {
        
    }public static int sumOfElements(int [] arr, int n){
        HashMap <Integer, Integer> hm = new HashMap<>();

        for(int i =0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]+1));
            }else{
                hm.put(arr[i],1);
            }
        }
        int sum =0;
        for(Integer key:hm.keySet()){
            if(hm.get(key)>=key){
                sum = sum +key;
            }
        }
        return sum;
    }
}
