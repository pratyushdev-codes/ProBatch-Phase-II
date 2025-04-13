/**
 * sumofNaturalNumbers
 */
public class sumofNaturalNumbers {

    public static void main(String[] args) {
        
    }public static int dphelper(int N){

    }public static int sumofNaturalnumbers(int N){
        if(N==0){
            return 0;
        }
        
        return N*sumofNaturalnumbers(N-1);
    }

}