package Day25_arrays_part2;

public class Task_92 {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i+1;

        }

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] *= 19;
            System.out.println("numbers[" + i + "] = " + numbers[i]);

        }
    }
}
