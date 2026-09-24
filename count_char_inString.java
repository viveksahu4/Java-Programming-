public class count_char_inString {
    static int countchar(String s){
        int count = 0;
        for(char c: s.toCharArray()){
            if(c != ' ') count++;
        }
        return count;

    }

    public static void main(String [] args){
        System.out.print(countchar("viveksahufromlovelyprofessiona;liiuniversitypunjabjalandharphagwaraṇ"));
    }
}
