import java.util.HashSet;

public class ArrayisSubsetofanotherarray {
    public static void main(String[] args) {
        
    }public static boolean CheckSubset(int arr1 [], int arr2[], int m, int n){
        HashSet<Integer> hset = new HashSet<>();
 
        // hset stores all the values of arr1
        for (int i = 0; i < m; i++) {
            if (!hset.contains(arr1[i]))
                hset.add(arr1[i]);
        }
 
        // loop to check if all elements
        //  of arr2 also lies in arr1
        for (int i = 0; i < n; i++) {
            if (!hset.contains(arr2[i]))
                return false;
        }
        return true;
    }
    
}
