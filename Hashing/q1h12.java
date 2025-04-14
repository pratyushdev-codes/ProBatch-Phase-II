import java.util.HashMap;
import java.util.Scanner;

public class q1h12 {
    static HashMap<Integer, Integer> hm= new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
    }

   
     for (int i=0; i<n; i++)
            if (hm.containsKey(arr[i]) )
                hm.put(arr[i], hm.get(arr[i]) + 1);
            else hm.put(arr[i] , 1);
    }    static int query(int x)
    {
        if (hm.containsKey(x))
            return hm.get(x);
        return 0;
    }
    

}

