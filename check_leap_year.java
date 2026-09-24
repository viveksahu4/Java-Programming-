import java.util.*;
public class check_leap_year {
    static boolean isleapyear(int year){
        if(year %  4 != 0) return false;
        else if(year % 100 != 0) return false;
        else if(year % 400 == 0 || year % 4 == 0) return true;
        else{
            return false;
        }


    }
    public static void main(String[] args){
        System.out.println((isleapyear(2000)? "leap year" : "not leap year"));
    }
}
