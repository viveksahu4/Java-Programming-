public class multiplication_table {
    static void printtable(int n){
        for(int i=0;i<= 10;i++){
            System.out.println(n + " x "+  i + " = "+(n * i));
        }
    }

    public static void main(String[] args){
        printtable(5);
    }
}
