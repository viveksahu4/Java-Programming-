public class factorial_num {
     // via recursive 

    // static long factorial_num(int n){
    //     if(n  == 0 || n == 1 ){
    //         return 1;
    //     }
    //     return n* factorial_num(n - 1);
    // }


    // via iterative 
    static long factorial_num(int n){
        long result = 1;
        for(int i=2;i<= n;i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args){
        int n = 5;
        System.err.println(factorial_num(n));
    }
    
}
