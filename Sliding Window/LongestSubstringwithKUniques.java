import java.util.HashMap;

public class LongestSubstringwithKUniques {
    public static void main(String[] args) {
       String s = "aabacbebebe";
       int k = 3;


    int i =0 ;int  j = 0 ; int maxLength = 0;
       HashMap<Character, Integer> hm = new HashMap<>();
while (i< s.length() && j< s.length()) {
    char ch= s.charAt(i);
           hm.put(ch , hm.getOrDefault(0)+1) ;  
            
           
           if(hm.size()==k){
            maxLength = Math.max(maxLength , (i-j+1));
           }else if (hm.size()>k){
                while(hm.size()>k){
                    int val = hm.get(s.charAt(i));
                    val--;
                      if(val > 0) {
                        hm.put(s.charAt(i), val);
                    } else {
                        hm.remove(s.charAt(i));
                    }
                    i++;
                }
            }
            j++;
        }
        
        return maxLength;
    }
}