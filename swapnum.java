// import java.util.Scanner;

// public class swapnum {
//     public static void main(String[] args){
//         int a = 5;
//         int b = 10;
//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;

//         System.out.println(a + " " + b);
//     }
// }


import java.util.Scanner;
public class swapnum{
    public static void main(String[] args){
        int a = 10,b = 20;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a + " "+ b);
    }
}