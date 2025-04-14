import java.util.HashMap;

public class h17q2 {
    public static void main(String[] args) {
        
    }public int countXORsubarray(int arr [],int n  ,int k){
        int ans = 0 ;
        HashMap<Integer , Integer > hm = new HashMap<>();
        
        int xorArray [] = new int [n];
        xorArray[0] = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            xorArray[i]= xorArray[i-1]^arr[i];
        }



        for(int i = 0 ; i< n ; i++){
            int temp = k^xorArray[i];

            if(hm.containsKey(xorArray))
        }
    }
}
//pending question need to solve this 