// Given an array with repeated elements, the task is to find the maximum distance between two occurrences of an element.

import java.util.HashMap;
import java.util.HashSet;

public class MaxDistancebetweenPairs {
    public static void main(String[] args) {
        
    }public static int getMaxDistance(int arr[]){
        int maxDist=0;
HashMap<Integer, Integer>hm = new HashMap<>();
for(int i =0;i<arr.length;i++){
    if(!hm.containsKey(arr[i])){
        hm.put(arr[i], i);
    }else{
       maxDist = Math.max(maxDist, i-hm.get(arr[i]));

    }
   
}

return maxDist;



    }
    
}
