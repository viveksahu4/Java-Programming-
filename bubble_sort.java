import java.util.*;
public class bubble_sort {
    static void bubblesort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean check = false;
            for(int j=0;j<n - i - 1;j++){
                if(arr[j] > arr[j + 1]){
                    int temp  = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = true;
                }
            }
            if(!check) break;
        }
    }

    public static void main(String [] args){
        int[] arr = {5,4,6,7,8,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
