import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class minandmaxEle {

    public static void main(String[] args) {
        
        int arr [] = {2, 1, 3,4 , 2,2};

        Map<Integer, Integer> hm = new HashMap<>();

        int minFrequency = Integer.MAX_VALUE;
        int maxFrequency = Integer.MIN_VALUE;

        int maxElement = arr[0];
        int minElement = arr[0];


        for(int i = 0 ; i <arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

       for(  Map.Entry<Integer, Integer> num : hm.entrySet()){
        if(num.getValue() > maxFrequency){
            maxFrequency = num.getValue();  
            maxElement = num.getKey();
       }else if(num.getValue()<= minFrequency){
        minFrequency = num.getValue();
        minElement = num.getKey();
       }
            
     




    }
}