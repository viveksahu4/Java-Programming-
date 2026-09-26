import java.util.Scanner;

public class gcd_lcm {
    public static void gcdlcm(int a,int b){
        int gcd = 1;
        for(int i=1;i<=a && i<=b;i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }

        int lcm = (a  * b) / gcd;

        System.out.print(gcd+" "+lcm);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        gcdlcm(a, b);
    }
}
