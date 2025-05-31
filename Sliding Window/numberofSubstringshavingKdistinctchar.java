import java.util.*;
public class numberofSubstringshavingKdistinctchar {
    public static void main(String[] args) {
        String S = "abcca";
        int K =3;
        
        int i =0,  j= i+1; 
        int count =0;
        HashMap<Character, Integer> hm = new HashMap<>();
        while( j<S.length()){
            char c = S.charAt(i);
            hm.put(c, hm.getOrDefault(hm, 0)+1);
            j++;
            while(hm.size()>=K){
                char pre = S.charAt(i);
                hm.put(pre , hm.getOrDefault(pre, 0)-1);

                if(hm.get(pre)==0){
                    hm.remove(pre);
                }
                count += S.length() - j + 1; // Count all substrings starting from i to j-1
                i++;
            }
        }
        System.out.println(count);
    }
}
