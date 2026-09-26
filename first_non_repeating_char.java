import java.util.*;
public class first_non_repeating_char {
    public static char firstnonrep(String s){
        for(int i=0;i<s.length();i++){
            boolean repeated = false;
            for(int j  = 0;j<s.length();j++){
                if(i != j && s.charAt(i) == s.charAt(j)){
                    repeated = true;
                    break;
                }
            }

            if(!repeated) return s.charAt(i);
        }
        return '\0';
    }


    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();

        char result = firstnonrep(s);
        if(result == '\0') System.out.println("no non repating char in the string");
        else{
            System.out.print(result);
        }
    }
}


