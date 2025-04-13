public class SingleElement {
    public static void main(String[] args) {
        
    }public int singleNonDuplicate(int arr []){
        int ans =0;
        int n = arr.length;
        for(int i =0; i<n; i++){
            ans = ans ^ arr[i];
        }
return ans ;
    }
}
