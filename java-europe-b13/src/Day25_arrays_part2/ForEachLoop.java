package Day25_arrays_part2;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] products = {"Timberland","shirt","Watch","Bag","Shoes"};
        double[] prices = {120.0,12.99,300,25,67.89};

        for (String prod : products){

            System.out.println(prod);
        }

        for (double pr : prices){

            System.out.println(pr);
        }
    }
}
