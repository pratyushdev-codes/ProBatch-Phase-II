public class isSubsequence {
    public static void main(String[] args) {
       //Main function
    }public static boolean findSubsequence(String S , String T){
        int i =0  ;
        int j =0;
        if(S.length()==0){
            return true;
        }
        while(i<S.length() && j<T.length()){
            char c1 = S.charAt(i);
            char c2 = T.charAt(j);

            if(c1==c2){
                i++;
                j++;
            }else{
                j++;
            }

            if(i==S.length())return true;
 
        }
        return false;
    }
}

