package Day24_arrays_part1;

public class ArrayCreation {
  public static void main(String[] args) {

    //Option-1
    int[] numbers;
    numbers = new int[3];

    //Option-2
    int[] number1 = new int[3];
    float[] temp = new float[100];
    char[] letters = new char[40];
    long[] units = new long[50];
    String words[] = new String[5];

    System.out.println(number1[2]);
    System.out.println(temp[90]);
    System.out.println(letters[30]);
    System.out.println(units[49]);
    System.out.println(words[4]);

    //Example;
    int[] scores = new int[5];
    scores[0] = 80;
    scores[1] = 85;
    scores[2] = 90;
    scores[3] = 100;
    scores[4] = 50;

    System.out.println(scores[0]);
    System.out.println(scores[1]);
    System.out.println(scores[2]);
    System.out.println(scores[3]);
    System.out.println(scores[4]);

    int avgScores = (scores[0]+scores[1]+scores[2]+scores[3]+scores[4])/5;
    System.out.println(avgScores);


  }
}
