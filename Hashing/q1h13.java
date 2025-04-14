public class q1h13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr [] = new int [n];
        for(int i : arr){
            arr[i]= sc.nextInt();
        }


        HahsMap<Integer ,Integer> hm = new HashMap<>();

         int max = 0 ;
        for(int i = 0 ; i < n; i++){

            //first we will check if it does not exists or not , if it does not exsist we will add

            if(!hm.containsKey(arr[i])){
                hm.put(arr[i] , 1);
            }else{
                //else if it exists , update the max difference
                max= Math.max(max , i-hm.get(arr[i]));
            }

        }
    }
}
