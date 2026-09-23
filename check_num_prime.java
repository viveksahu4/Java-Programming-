// public class check_num_prime {
//     static boolean isPrime(int n){
//         if(n <= 1) return false;
//         for(int i=2;i<= Math.sqrt(n);i++){
//             if(n % i == 0) return false;
//         }
//         return true;
//     }
//     public static void main(String[] args){
//         int n = 28;
//         System.out.println(isPrime(n)?"Prime":"not prime");
//     }
// }



public class check_num_prime{
    static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i=2;i<= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int n = 29;
        System.out.println(isPrime(n)?"prime":"not prime");
    }
}