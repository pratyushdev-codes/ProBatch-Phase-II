import java.util.*;
public class isPalindrome {

    public static void main(String[] args) {
        
    }public static boolean ispalindrome(String S){
        S=S.toLowerCase().replaceAll("[^A-za-z0-9]", " ");
        int i =0;
        int j= S.length()-1;
        while(i<=j){
            if(S.charAt(i)!=S.charAt(j+1)) return false;

        }
       
         i++;
        j--;
        }
        return true;
    }
