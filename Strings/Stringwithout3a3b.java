

/**
 * Stringwithout3a3b
 */
public class Stringwithout3a3b {

    public static void main(String[] args) {
        
    }public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();
        while(a>0 || b>0){
            if(a>b && b!=0){
                sb.append("aab");
                a= a-2;
                b= b-1;
                
            }else if (b > a && a != 0) {
                sb.append("abb");
                b= b-2;
                a= a-1;

            }else{
                if(a>0){
                    sb.append("a");
                    a--;
                }else if(b>0){
                    sb.append('b');
                    b--;
                }

            }

   
        }
        return sb.toString();

    }
}