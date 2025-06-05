// Understanding :-> Given X and Y ; find F(X) - F(Y)

// Where F(X) = 	largest prime number less than <=x. 


public class Q3WallmartOA {

    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(f(x)- f(y));



// The f(int x) method:
// Finds the largest prime number that is ≤ x and within 200 of x
// Searches backwards from x down to (x-200)
// Returns the first prime number it finds, or defaults to 2 if none found
    }public static int f(int x){
        int ans = 2;
        for(int i = x ; i>=x-200 ; i--){
            if(findPrime(i)){
                ans = i;
                break;
            }
        }
        return ans;
    } public static boolean findPrime(int n){
        int count =0;

        for(int i = 0 ; i < Math.sqrt(n); i++){
            if(i*i==n){
                count = count + 1;
            }else if(n%i==0){
                count = count+2;
            }
        }
        return count ==2;
    }
}