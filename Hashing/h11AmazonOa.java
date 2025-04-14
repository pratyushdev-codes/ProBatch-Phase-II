import java.util.HashMap;
import java.util.Scanner;

public class h11AmazonOa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i : arr){
            arr[i] = sc.nextInt();
        }

      
        HashMap<Integer ,Integer> hm = new HashMap<>();
       
        for(int i = 0 ; i< arr.length ; i++){
            hm.put(arr[i],  hm.getOrDefault(arr[i], 0)+1); //stpring the frequency of each element  in the hashamap 
        }
    }
}
