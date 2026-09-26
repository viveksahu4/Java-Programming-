public class max_subarr_sum {
    static int maxarrSum(int[] arr){
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for(int num : arr){
            currentsum += num;

            if(currentsum > maxsum) maxsum = currentsum;
            if(currentsum < 0) currentsum  = 0;
        }
        return maxsum;
    }

    static void main(String[] args){
        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.print(maxarrSum(arr));
    }
}






