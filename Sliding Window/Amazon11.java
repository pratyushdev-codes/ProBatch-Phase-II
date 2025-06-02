public class Amazon11 {

    public static void main(String[] args) {
        String searchWord= "abcz";
        String resultWord= "azdb";
int i =0;
int j =0;
int len =0;
        while(i<searchWord.length() && j<resultWord.length()){

            if(searchWord.charAt(i)==resultWord.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }



        }
        len = resultWord.length()-j;
        System.out.println(len);
    }
}