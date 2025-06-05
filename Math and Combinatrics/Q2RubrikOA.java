// Understanding :-> Given an integer “N” ; divide it into 3 parts; k1;k2;k3 such that k1 + k2 + k3 ==N and k1<=k,k2<=k,k3<=k

// 1<=K<=5000
// 0<=S<=3*K 


public class Q2RubrikOA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int S = sc.nextInt();
        int count =0;

        long b = 0 ;
        for(int i =0 ; i < k; i++){
            for(int j = 0 ; j<k ; k++){
                b = S- (i+j);
                if(b<= k && b>=0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
