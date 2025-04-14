import java.util.*;
public class t8GoogleOA {
    static int p=-1;
    public static void main(String[] args) {
        String A= "jdkwjewd";
        String B = "jdw";

        int ans = -1;

        for(int i =0 ; i< B.length() ; i++){
            for(char c='a'; c<='z'; c++){
                StringBuilder answer = new StringBuilder(B);
                answer.setCharAt(i, c);
                p=-1;
                if(checkAapprearsB(A, answer.toString())){
                       ans = p+1;
                }
                System.out.println(ans);
            }
        }
        
    }
    ///this is the helper function that check if the string b is in string a or not 
    public static boolean checkAapprearsB(String A , String B){
        int count =0;
        int i = 0 ;
        int j = 0 ;
        while(i<A.length() && j < B.length()){
            if(A.charAt(i)!=B.charAt(j)){
                i = i+1;
            }else{
                i++;
                j++;
                count++;
            }
        }
        if(count==B.length()){
            return true;
        }
        return false;
    }

}
