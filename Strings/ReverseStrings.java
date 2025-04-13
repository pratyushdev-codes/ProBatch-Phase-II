
public class ReverseStrings {
    public static void main(String[] args) {

    }public static void Reversetring(char[] ch) {
        int s =0;
        int e = ch.length-1;
         while(s<e){
            char temp =ch[s];
            ch[s]= ch[e];
            ch[e]=temp;
            s++;
            e--;

         }

    }

}