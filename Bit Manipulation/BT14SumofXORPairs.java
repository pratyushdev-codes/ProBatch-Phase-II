public class BT14SumofXORPairs {
    public static void main(String[] args) {
        
    }public long SumofXOR(int arr [] , int n){
        int res =0;
        int oneCount =0;
        int zeroCount =0;
        for(int i =0; i<n ; i++){
            int XOR =0;

            for(int j =0 ; j< n ; j++){
                if(arr[j] & (arr[i]<<1)!=0){
                        oneCount++;
                }else{
                    zeroCount++;
                }
            }
            long product = zeroCount*oneCount;
            res+= product;
        }
        return res;
    }
}
