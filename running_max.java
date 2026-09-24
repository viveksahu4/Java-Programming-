import java.util.Scanner;
import java.util.*;
public class running_max {
    public static int countrunmax(int[] arr){
        int maxsofar = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > maxsofar){
                count++;
                maxsofar =arr[i];
            }
        }

        return count;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        System.out.print(countrunmax(arr));
    }
}
