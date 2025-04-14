import java.util.HashMap;

public class session1 {
  public static void main(String[] args) {
    
    int n = sc.nextInt();
    int arr []= new int [n];
    HashMap<Integer, Integer> hm= new HashMap<>();


    for(int i = 0 ; i< arr.length; i++){
        if(hm.containsKey(arr[i])&& i - hm.get(arr[i])>= k){
            return true;
        }else{
            return false;
        }
    }
  }
    
}