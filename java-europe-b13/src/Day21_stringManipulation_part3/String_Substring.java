package Day21_stringManipulation_part3;

public class String_Substring {
    public static void main(String[] args) {

        String sentence = "Java String Manipulation is fun!";

        System.out.println(sentence.substring(2));
        System.out.println(sentence.substring(5,10));
        System.out.println(sentence.length());
        System.out.println(sentence.substring(5,sentence.length()-5));

        String chars = "{{}}";
        String word = "AUTOMATION";

        System.out.print(chars.substring(0,2));
        System.out.print(word);
        System.out.println(chars.substring(2));

        String str = chars.substring(0,2) + word + chars.substring(2);
        System.out.println(str);

        String str2 = chars.substring(0,2).concat(word).concat(chars.substring(2));
        System.out.println(str2);

    }



}
