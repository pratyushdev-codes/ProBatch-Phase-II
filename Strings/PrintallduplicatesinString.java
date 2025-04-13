import java.lang.reflect.Array;
import java.util.*;

public class PrintallduplicatesinString {

    public static void main(String[] args) {
        
    }public static void printDuplicates(String str){
        char[] chars = str.toCharArray();
         int len = str.length();
         Arrays.sort(chars);
         String sortedStr = new String(chars);

         for(int i =0;i<=len;i++){
            

               int count =1;
            while(i<len-1 && sortedStr.charAt(i)==sortedStr.charAt(i+1)){
                count ++;
                i++;
               
  

            }if(count>1){
                System.out.println(sortedStr.charAt(i)+"count"+ count);
            }



         }

    }
}