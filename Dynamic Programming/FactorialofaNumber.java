/**
 * FactorialofaNumber
 */
public class FactorialofaNumber {

    public static void main(String[] args) {
        
    }public static int factorialNumber(int N){
        if (N == 0 || N ==1){
            return 0;
        }
        return N*factorialNumber(N-1);
    }
}