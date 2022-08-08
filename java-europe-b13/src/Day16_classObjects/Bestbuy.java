package Day16_classObjects;

public class Bestbuy {
  public static void main(String[] args) {

    CellPhone cell1 = new CellPhone();

    System.out.println(cell1.brand);
    System.out.println(cell1.screenSize);

    cell1.brand="Nokia 6300";
    cell1.color="Silver";
    cell1.price=76.16;
    cell1.screenSize=2.0;

    System.out.println(cell1.brand);
    System.out.println(cell1.screenSize);
    System.out.println(cell1.price);
    System.out.println(cell1.color);

    cell1.color="Black";
    System.out.println(cell1.color);

    CellPhone cell2 = new CellPhone();
    cell2.brand="Siemens";
    cell2.color="Red";
    cell2.screenSize=1.5;
    cell2.price=39.22;

    System.out.println("Color:"+ cell2.color);
    System.out.println("Brand:"+ cell2.brand);
    System.out.println("Price:"+cell2.price);
    System.out.println("ScreenSize:"+cell2.screenSize);

    System.out.println("####Calling Methods####");

    cell1.call();
    cell1.message();
    cell1.takeAphoto();

    cell2.call();
    cell2.message();
    cell2.takeAphoto();





  }
}
