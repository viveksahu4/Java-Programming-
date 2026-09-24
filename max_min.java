public class max_min {
    static int[] findmaxmin(int[] arr){
        int maxval = arr[0], minval = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > maxval) maxval = arr[i];
            if(arr[i] < minval) minval  =arr[i];
        }
        return new int[] {maxval,minval};
    }
    public  static void main(String[] args){
        int[]arr = {3,4,5,6,78};
        int[] result = findmaxmin(arr);
        System.out.print(result[0] + " "+ result[1]);
    }
}
