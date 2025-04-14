public class PairandSum {
    public static void main(String[] args) {
        
    }static long pairAndSum(int n, long arr[]) {
            long result =0;
            for(int bit = 0 ; bit< 30 ; bit++){
                long countOne =0;
                for(int i =0 ; i< n; i++){
                    if((arr[i]& (1 << bit))!=0){
                        countOne++;
                    }
                }
                result += (long)countOne*(countOne-1)/2* (1<<bit);
            }
            return result;
    }


    // }static long pairAndSum(int n , long arr []){
    //     long result =0;
    //     for(int bit = 0; bit < 30 ; bit++){
    //         long countOne =0;

    //         for(int i = 0 ; i<n ; i++){
    //             if(arr[i] & (1<<bit)!=0){
    //                 countOne++;
    //             }
    //         }
    //         result += (long)countOne*(countOne-1)/2*(1<<bit);

    //     }
    //     return result;
    // }
}
