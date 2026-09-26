public class string_length {
    static int lenString(String s){
        int length = 0;
        char[] chars = s.toCharArray();
        for(char c: chars){
            length++;
        }
        return length;
    }


    public static void main(String[] args){
        System.out.println(lenString("hello world"));
    }
}
