//Array Method
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountingFrequencies {
    public static void main(String[] args) {
        
    }public static void countFreq(int arr [], int n){
        boolean Visited[]= new boolean[n];
        Arrays.fill(Visited, false);

        for(int i =0;i<n;i++){
            if(Visited[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]== arr[j]){
                    Visited[j]= true;
                    count ++;
                }
            }
            System.out.println(arr[i]+" "+ count);
        }

    }public static void CountingFrequenciesHashMaps(int arr[], int size){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i =0;i<size; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);

            }else{
                hm.put(arr[i],1);
            }
        }
     for (Map.Entry entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }




    }




