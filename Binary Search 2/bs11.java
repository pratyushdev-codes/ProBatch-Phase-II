public class bs11 {
    public static void main(String[] args) {
        
    }public char nextGreatestLetter(char[] letters, char target) {
        int start = 0 ;
        int end = letters.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

             if(letters[mid]<=target){
                start = mid+1;
            }else{
                end = mid-1;
            }
            if(start== letters.length){
                return letters[0];
            }
        }
        return letters[start];





    }
}
