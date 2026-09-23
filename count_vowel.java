public class count_vowel{
    static int countvowels(String s){
        int count = 0;
        for(char c: s.toCharArray()){
            char lower = Character.toLowerCase(c);
            if(lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower =='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String [] args){
        System.out.println(countvowels("Accenture"));
    }
}