
// 1647. Minimum Deletions to Make Character Frequencies Unique


import java.util.HashSet;

public class MinDel {
    public static void main(String[] args) {
        
    }public int minDeletions(String s) {
        if(s.length()==0){
            return 0;
            }


            int arr []= new int [26];
            for(int i =0;i<s.length();i++){
                char ch= s.charAt(i);
                arr[ch-'a']++;

             
            }
            HashSet<Integer> hm = new HashSet<>();
            int count=0;
            for(int i =0; i<26;i++){
                int f = arr[i];
                if(!hm.contains(f)){
                    hm.add(f);
                }else{
                    while(f>0 && hm.contains(f)){
                        f--;
                        count ++;
                    }
                    hm.add(f);
                }
               
            }
            return count;
        }
        
    }

