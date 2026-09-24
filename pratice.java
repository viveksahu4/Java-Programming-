import java.util.*;

public class pratice {
//     static int[] swap(int a,int b){
//         a = a ^ b;
//         b = a ^ b;
//         a = a ^ b;

//         return new int[] {a, b};
//     }


// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int[] result = swap(a, b);
//     System.out.println(result[0] + " "+result[1]);

// }


    // static boolean isPrime(int n){
    //     if(n <= 1) return false;
    //     for(int i=2;i<= Math.sqrt(n);i++){
    //         if(n % i == 0) return false;
    //     }
    //     return true;
    // }


    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     System.out.println((isPrime(n)?"prime": "not prime"));
    // }


    // public static long factorial(int n){
    //     long result = 1;
    //     for(int i=2;i<=n;i++){
    //         result *= i;
    //     }

    //     return result;
    // }

    // public static long factorial(int n){
    //     if(n == 0 || n == 1) return 1;
    //     return n* factorial(n - 1 );
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     System.out.println(factorial(n));
    // }




    // public static int secondlargest(int[] arr){
    //     int first = Integer.MIN_VALUE;
    //     int second  = Integer.MIN_VALUE;

    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i] > first){
    //             second = first;
    //             first = arr[i];
    //         }
    //         else if(arr[i] > second && arr[i] != first){
    //             second = arr[i];
    //         }
    //     }
    //     return second;

    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];

    //     for(int i=0;i<n;i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     System.out.print(secondlargest(arr));
    // }



    // static void reversearr(int[] arr){
    //     int left = 0;
    //     int right = arr.length - 1;
    //     while(left < right){
    //         int temp = arr[left];
    //         arr[left] = arr[right];
    //         arr[right] = temp;
    //         left++;
    //         right--;
    //     }
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr =  new int[n];

    //     for(int i=0;i<n;i++){
    //         arr[i] = sc.nextInt();
    //     }


    //     reversearr(arr);
    //     for(int i=0;i<n;i++){
    //         System.out.print(arr[i]+" ");
    //     }
        
    // }


    // static void movezero(int [] arr){
    //     int j = 0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i] != 0){
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //             j++;
    //         }
    //     }
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     movezero(arr);
    //     for(int i=0;i<n;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    
    // }


    // public static  int maxsubarrsum(int [] arr){
    //     int maxsum = Integer.MIN_VALUE;
    //     int currentsum = 0;
    //     for(int i=0;i<arr.length;i++){
    //         currentsum += arr[i];

    //         if(currentsum > maxsum) maxsum = currentsum;
    //         if(currentsum < 0) currentsum = 0;
    //     }
    //     return maxsum;
    // }


    //     public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i] = sc.nextInt();
    //     }


    //     System.out.print(maxsubarrsum(arr));

    //  }


    // public static boolean chplain(String s){
    //     int left = 0;
    //     int right = s.length() - 1;
    //     while(left < right){
    //         if(s.charAt(left) != s.charAt(right))
    //             return false;

    //         left++;
    //         right--;
    //     }

    //     return true;
    // }

    //     public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     String s = sc.nextLine();
    //     System.out.print((chplain(s)?"plaindroum":"not plaindroum"));
    // }


    // public static String revstr(String str){
    //     char [] chars = str.toCharArray();
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

    //     public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     String str = sc.nextLine();

    //     System.out.print(revstr(str));
    // }

    // public static boolean issanagram(String s1, String s2){
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


    //     System.out.print((issanagram(s1, s2)?"anagram":"not anagram"));
    // }

    // public static int revnum(int n){
    //     int rev = 0;
    //     while( n != 0){
    //         int digit = n % 10;
    //         rev = rev * 10 + digit;
    //         n/= 10;
    //     }
    //     return rev;
    // }

    // public static void main(String [] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n  =  sc.nextInt();
    //     int orginal = n;
    //     int revv = revnum(n);
    //     System.out.println(revv);
    //     System.out.print((revv == orginal));

    // }



    // binary search 
    // public static int binarysearch(int[] arr, int target){
    //     int left = 0;
    //     int right = arr.length - 1;
    //     while(left <= right){
    //         int mid = left + (right - left) / 2;
    //         if(arr[mid] == target) return mid;
    //         else if(arr[mid] > target){
    //             right = mid -  1;
    //         }
    //         else{
    //             left = mid + 1 ;
    //         }
    //     }
    //     return -1;

    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];

    //     for(int i=0;i<n;i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     int target = sc.nextInt();

    //     System.out.println(binarysearch(arr, target));
    // }

    // public static void qbubbleSort(int[] arr) {
    //     int n = arr.length;

    //     for (int i = 0; i < n - 1; i++) {
    //         boolean swapped = false;

    //         for (int j = 0; j < n - i - 1; j++) {

    //             if (arr[j] > arr[j + 1]) {

    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;

    //                 swapped = true;
    //             }
    //         }

    //         if (!swapped)
    //             break;
    //     }
    // }

    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();

    //     int[] arr = new int[n];

    //     for (int i = 0; i < n; i++) {
    //         arr[i] = sc.nextInt();
    //     }

    //     qbubbleSort(arr);

    //     // Print sorted array
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }


    // public static int fib(int n){
    //     if(n == 0) return 0;
    //     if(n == 1) return 1;
    //     return fib(n - 1) + fib(n - 2);

    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     System.out.print(fib(n));
    // }


    // public static int sumofdigit(int n){
    //     if(n == 0) return 0;
    //     return (n % 10) + sumofdigit(n / 10);
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     System.out.println(sumofdigit(n));
    // }

    // public static int gcd(int a, int b){
    //     while(b != 0){
    //         int temp = b;
    //         b = a % b;
    //         a = temp;

    //     }
    //     return a;
    // }

    // public static int lcm(int a,int b,int gcdvalue){
    //     return (a * b) / gcdvalue;
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int g = gcd(a,b);
    //     int l = lcm(a,b,g);

    //     System.out.print(g+" "+l);
    // }



    // public static int countvowels(String s){
    //     int count = 0;
    //     for(int i=0;i<s.length();i++){
    //         char ch = Character.toLowerCase(s.charAt(i));
    //         if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     String s = sc.nextLine();

    //     System.out.print(countvowels(s));
    // }

    // public static int[] twosum(int [] arr, int target){
    //     for(int i=0;i<arr.length - 1 ; i++){
    //         for(int j = i  + 1 ;j< arr.length;j++){
    //             if(arr[i] + arr[j] == target){
    //                 return new int [] {i,j};
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }


    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];

    //     for(int i=0;i<n;i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     int target = sc.nextInt();

    //     int[] result = twosum(arr, target);

    //     if(result[0] != -1){
    //         System.out.print(result[0]+" "+result[1]);
    //     }
    //     else{
    //         System.out.print("no pair found");
    //     }

    //     sc.close();
    // }


    
}



