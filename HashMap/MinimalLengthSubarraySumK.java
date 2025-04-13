import java.util.HashMap;
import java.util.Scanner;

public class MinimalLengthSubarraySumK {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int  n =sc.nextInt();
        int arr []= new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        
        }
        int k = sc.nextInt();
        int result = MinimalLengthSubarraysum(arr, k);
        System.out.println(result);
    }public static int MinimalLengthSubarraysum(int arr [], int k){
        HashMap <Integer, Integer> hm = new HashMap<>();
        int count =0;
        int sum =0;
        int minDist =0;

        for(int i =0;i<arr.length;i++){
            sum = sum + 1;
            if(hm.containsKey(sum-k)){
                count =count+ hm.get(sum -k);
            }

            minDist= Math.min(minDist, count);
            hm.put(sum , hm.getOrDefault(sum,0)+1);
        }
        return count;
    }

}
