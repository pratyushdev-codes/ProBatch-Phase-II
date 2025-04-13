import java.util.HashSet;

public class CheckpairwithgivenSum {
    public static void main(String[] args) {
        
    }public static void printPair(int arr [], int sum){
        HashSet<Integer> hm = new HashSet<Integer>();
        

        for(int i =0;i<arr.length;i++){
            int temp = sum- arr[i];
            if(hm.containsKey(temp)){
                System.out.println("Yes");
                return;
            }
            hm.add(arr[i]);
        }System.out.println("no");
    }
}
