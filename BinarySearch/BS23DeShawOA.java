import java.util.*;
public class BS23DeShawOA {

    public static void main(String[] args) {
    
    } public boolean checkSum(int arr [] , int limit, int k ){
        int n = arr.length;
        int g [] = new int [n+1];

        for(int i = 1 ; i<= n ; i++){
            int value = i * k + arr[i - 1];
            g[i]= value;
        }
        Arrays.sort(g);
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += g[i];
        }
        return sum <= limit;

        
    }public int findAns(int arr[]  , int N){
        int n = arr.length;
        Arrays.sort(arr);

        int start = 1;
        int end = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (!check(mid, b, m)) {
                high = mid - 1;
            } else {
                if (check(mid + 1, b, m)) {
                    low = mid + 1;
                } else {
                    r = mid;
                    break;
                }
            }
        }
 
        // Handle the case where k = 1 is also not working
        if (r == 0 && !check(1, b, m)) {
            r = 0;
        }
 
        // Output
        System.out.println(r);
    }
    

