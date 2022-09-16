package Day25_arrays_part2;

public class ReturnArray {
    public static void main(String[] args) {

        double[] values = getArray();

       // values = getArray();

        for (double num : values){

            System.out.println(num +" ");
        }
    }

    public static double[] getArray(){

        double[] array = {1.2,2.3,4.4,5.6};

        return array;
    }
}
