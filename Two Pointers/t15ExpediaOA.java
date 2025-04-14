import java.lang.reflect.Array;
import java.util.Arrays;

public class t15ExpediaOA {
    public static void main(String[] args) {
        int A [] = {1,2, 3 };
        int B [] = {1,2,1};
        int n = A.length;
        Arrays.sort(A, 0, n);
        Arrays.sort(B, 0, n );
        int i = 0 ;
        int j = 0;
        int pairCount = 0;
     while(i<n && j<n){
        if(A[i]>B[j]){
            pairCount++;
           i++;
           j++;
          
        }else{
            i++;
            
        }
     }
        
        System.out.println(pairCount);




    }
}
