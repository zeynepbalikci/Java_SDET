package Day7_ifStatement;

public class task_28 {
  public static void main(String[] args) {

    double revenue,price,quantity,discount;
    price = 50;
    quantity = 15;
    revenue = price*quantity;
    if (revenue>500){
         revenue=revenue*0.9;

    }
    System.out.println(revenue);
  }
}
