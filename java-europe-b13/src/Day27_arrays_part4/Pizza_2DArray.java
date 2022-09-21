package Day27_arrays_part4;

import java.sql.Array;
import java.util.Arrays;

public class Pizza_2DArray {
  public static void main(String[] args) {

    String [][] pizzas = {

        {"pinneapple","pepperoni"},
        {"anchovies","mushroom","olives"},
        {"4 cheese"},
        {"chicken","tomates","onioons"},
        {"green peppers","zuccini","brocoli","spinach","shrimp"}
    };

    //System.out.println(Arrays.toString(pizzas));

    System.out.println("#### FOR EACH LOOP ####");

    for (String[] pizza : pizzas){

      System.out.print(pizza.length + "-");
      System.out.println(Arrays.toString(pizza));
    }

    System.out.println("#### FOR ITERATOR LOOP ####");

    for (int i = 0; i < pizzas.length; i++) {

      System.out.print(pizzas[i].length + "-");
      System.out.println(Arrays.toString(pizzas[i]));
      
    }
    System.out.println("----------------");

    for (String value : pizzas[3]){

      System.out.println(value);
    }

    int [][] students = {{4,5,6},{12,5,7},{23,56,12,55,3}};
    for (int[] group : students) {
      for (int studentsID : group){
        System.out.println(studentsID);
      }

    }








  }
}
