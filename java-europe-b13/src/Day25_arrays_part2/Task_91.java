package Day25_arrays_part2;

import java.util.Random;

public class Task_91 {
    public static void main(String[] args) {

        Random rn = new Random();
        int[] element = new int[10];

        for (int i = 0; i < element.length; i++) {

            element[i] = rn.nextInt(100);

            System.out.println("element " + "[" + i + "] = " + element[i]);
        }



    }
}
