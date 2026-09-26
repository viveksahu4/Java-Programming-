import java.util.Scanner;
import java.util.HashMap;
import java.util.*;
public class pratice_day_2 {
    // 1. 
    // public static int[] swapnum(int a,int b){
    //     a = a ^ b;
    //     b = a ^ b;
    //     a = a ^ b;

    //     return new int[]{a,b};
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int[] result = swapnum(a, b);
    //     System.out.print(result[0] + " "+result[1]);
    // }




    // 2.
    // public static boolean isprime(int n){
    //     if(n <= 0) return false;
    //     for(int i=2;i<= Math.sqrt(n);i++){
    //         if(n % i == 0) return false;
    //     }
    //     return true;
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = 5;
    //     System.out.print((isprime(n)?"prime":"not prime"));

    // }


    // 3.
    // static long fact(int n){
    //     long result = 1;
    //     if(n == 0 || n == 1 ) return 1;
    //     return n* fact(n - 1);
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = 5;
    //     System.out.print(fact(n));
    // }

    // 4.
    // public static int secondlargest(int[] arr){
    //     int first = Integer.MIN_VALUE;
    //     int second = Integer.MIN_VALUE;

    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i] > first){
    //             second = first;
    //             first = arr[i];
    //         }
    //         else if(arr[i] > second && arr[i] != first){
    //             second = arr[i];
    //         }
    //     }

    //     if(second == Integer.MIN_VALUE) return -1;
    //     return second;
    // }

    // public static void main(String[] args){
    //     Scanner sc  = new Scanner(System.in);
    //     // int [] arr = new int[n]; for user input 
    //     int[] arr = {1,2,3,4,5};

    //     System.out.print(secondlargest(arr));

    // }

    // 5.
    // public static void revarr(int[] arr){
    //     int left = 0;
    //     int right = arr.length - 1;


    //     while(left <= right){
    //         int temp = arr[left];
    //         arr[left] = arr[right];
    //         arr[right] = temp;
    //         left++;
    //         right--;
    //     }
    // }

    
    // public static void main(String[] args){
    //     Scanner sc  = new Scanner(System.in);
    //     int[] arr = {1,2,3,4,5};
    //     revarr(arr);
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }


    // 6.
    // public static void duplicatefind(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j = i + 1;j<arr.length;j++){
    //             if(arr[i] == arr[j]){
    //                 System.out.println(arr[i]+" ");
    //                 break;
    //             }
    //         }
    //     }
    // }

    // public static  void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int[] arr = {1,2,3,2,4,4,7,7};
    //     duplicatefind(arr);
    // }



    // 7.

    // public static void movezeros(int[] arr){
    //     int j = 0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i] != arr[j]){
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //             j++;
    //         }
    //     }
    // }

    // public static void main(String[] args){
    //     int[] arr = {0,1,2,0,3,0,4,0,8,9,6};
    //     movezeros(arr);
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }

    
    // 8.
    // public static int maxsubarr_sum(int[] arr){
    //     int maxsum = Integer.MIN_VALUE;
    //     int currentsum = 0;
    //     for(int i=0;i<arr.length;i++){
    //         currentsum += arr[i];


    //         if(currentsum > maxsum) maxsum = currentsum;
    //         if(currentsum < 0) currentsum =0;
    //     }
    //     return maxsum;
    // }

    // public  static void main(String[] args){
    //     int[] arr = {2, 3, -8, 7, -1, 2, 3};

    //     System.out.print(maxsubarr_sum(arr));

    // }


    // 9.
    // public static boolean Strpalindroum(String s){
    //     int left = 0;
    //     int right = s.length() - 1;
    //     while(left <= right){
    //         if(s.charAt(left) != s.charAt(right)){
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return  true;
    // }

    // public static  void main(String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     // String s = "level";
    //     String s = "sahu";
    //     System.out.print((Strpalindroum(s)?"palindroum":"not pallindromy"));
    // }



    // 10.

    // public static String revstr(String s){
    //     char [] chars  = s.toCharArray();
    //     int left = 0;
    //     int right = chars.length - 1;
    //     while(left < right){
    //         char temp = chars[left];
    //         chars[left] = chars[right];
    //         chars[right] = temp;
    //         left++;
    //         right--;
    //     }
    //     return new String(chars);

    // }

    // public static void main(String[] args){
    //     String s = "vivek";
    //     System.out.print(revstr(s));
    // }




    // 11.

    // public static boolean checkanagram(String s1,String s2){
    //     if(s1.length() != s2.length()){
    //         return false;
    //     }


    //     int[] count = new int[26];
    //     for(int i=0;i<s1.length();i++){
    //         count[s1.charAt(i) - 'a']++;
    //     }

    //     for(int i=0;i<s2.length();i++){
    //         count[s2.charAt(i) - 'a']--;

    //     }


    //     for(int i=0;i<26;i++){
    //         if(count[i] != 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     String s1 = sc.nextLine();
    //     String s2 = sc.nextLine();

    //     System.out.println((checkanagram(s1, s2)?"anagram":"not anagram"));
    // }




    // 12.

    // public static char first_non_repating_char(String s){
    //     for(int i=0;i<s.length();i++){
    //         boolean repated = false;
    //         for(int j = 0;j<s.length();j++){
    //             if(i != j && s.charAt(i) == s.charAt(j)){
    //                 repated = true;
    //                 break;

    //             }
    //         }
    //         if(!repated) return s.charAt(i);
    //     }
    //     return '\0';
    // }

    // public static void main(String[] args){
    //     Scanner sc  = new Scanner(System.in);
    //     String s = sc.nextLine();
    //     char result = first_non_repating_char(s);
    //     if(result == '\0') 
    //         System.out.print("no non repating char");
    //     else
    //         System.out.print(result);

    // }



    // 13.
    // public static void armstrongcheck(int n){
    //     int original =  n;
    //     int sum = 0;
    //     while(n > 0){
    //         int digit = n % 10;
    //         sum = sum +(digit * digit* digit);
    //         n /= 10;
    //     }

    //     if(sum == original){
    //         System.out.print("armstrong");
            
    //     }
    //     else{
    //         System.out.print("not armstrong");
    //     }



    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();


    //     armstrongcheck(n);
    // }





    // 14.

    // public static void gcd_lcm(int a,int b){
    //     int gcd = 1;
    //     for(int i=1;i<= a && i <= b;i++){
    //         if(a % i == 0 && b % i == 0){
    //             gcd = i;
    //         }
    //     }

    //     int lcm = (a * b) / gcd;

    //     System.out.println(gcd+" "+lcm);
    // }

    // public static void main(String [] args){
    //     Scanner sc= new Scanner(System.in);

    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     gcd_lcm(a, b);
    // }



    // 15.

    // public static int num_palindroum(int n){
    //     int rev = 0;
    //     while(n > 0){
    //         int digit = n % 10;
    //         rev = rev * 10 + digit;
    //         n/= 10;
    //     }

    //     return rev;
    // }

    // public static void main(String[] args){
    //     Scanner sc  = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int orginal = n;

    //     int revmain = num_palindroum(orginal);
    //     // System.out.print(revmain);
    //     System.out.print((revmain == orginal)?"plaindroum":"not palindroum");
    // }


    // 16.
    // public static int binarysearch(int[] arr,int target){
    //     int left = 0;
    //     int right = arr.length - 1;
    //     while (left <= right) {
    //         int mid = left + (right - left) / 2;

    //         if(arr[mid] == target){
    //             return mid;
    //         }
    //         else if(arr[mid] > target){
    //             right = mid - 1;
    //         }
    //         else{
    //             left = mid + 1;
    //         }
    //     }
    //     return -1;
    // }

    // public  static void main(String[] args){
    //     Scanner sc  = new Scanner(System.in);
    //     int[] arr = {1,2,3,4,5};
    //     int target = sc.nextInt();

    //     System.out.print(binarysearch(arr, target));
    // }



    // 17.
    // public static void bubblesort(int [] arr){
    //     int n = arr.length;
    //     for(int i=0;i<n;i++){
    //         boolean swapped = false;
    //         for(int j = 0;j<n - i - 1;j++){
    //             if(arr[j] > arr[j + 1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //                 swapped = true;
    //             }
    //         }

    //         if(!swapped) break;
    //     }
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
        
    //     int[] arr = {9,8,7,1,2,4,3,7};
    //     bubblesort(arr);

    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }

    // }




    // 18.
    //     static int fib(int n) {
    //     if (n == 0) return 0;
    //     if (n == 1) return 1;
    //     return fib(n - 1) + fib(n - 2);
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number:");
    //     int n = sc.nextInt();

    //     System.out.println(fib(n));
    // }







    

}
