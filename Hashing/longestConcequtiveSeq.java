public class longestConcequtiveSeq {
    public static void main(String[] args) {
        
    }public int longestConsecutive(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        int count = 1 ;
        int longest = 0;

        for(int num : nums){
            hm.add(num);
            
        }
         for(int  num : nums){
            if(!hm.contains(num-1)){
                int x = num;
                count=1;
                while(hm.contains(x+1)){
                    count++;
                    x++;







                }
         }

}
}
}