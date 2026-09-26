public class Moves_all_zeros_endArr {
    static void movezeroes(int[] arr){
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

    }

    public static void main(String[] args){
        int[] arr = {1,0,0,5,0};
        movezeroes(arr);
        for(int x: arr){
            System.out.print(x+" ");
        }
    }


}
