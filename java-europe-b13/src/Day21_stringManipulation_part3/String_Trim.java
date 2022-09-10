package Day21_stringManipulation_part3;

public class String_Trim {
    public static void main(String[] args) {

        String str = "342";
        String chars = "||";
        String str2 = chars.substring(0,1).concat(str).concat(chars.substring(1));
        System.out.println(str2);

        System.out.println("|"+str.trim()+"|");
    }
}
