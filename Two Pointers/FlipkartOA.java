import java.util.*;
public class FlipkartOA {

    public static void main(String[] args) {
        
    }public static void longestSubarray(int arr []){
         HashMap<Integer, Integer> hm = new HashMap<>();
         int n = arr.length;
         int freq = 0;
         int i =0;
         int j =0;
        while(i<n && j<n){
            if(!hm.containsKey(arr[j])){
                hm.put(arr[j],j);
                int l = Math.max(l, freq);
                j++;

            }else{
                int id = hm.get(arr[j]);
                while(i<=id){
                    hm.remove(arr[i]);
                    i++;

                }
                i = id+1;
                hm.put(arr[j],j);
                j++;
            }
        }
        System.out.println(j);
         }

    }
