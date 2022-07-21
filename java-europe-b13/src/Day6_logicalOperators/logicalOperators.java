package Day6_logicalOperators;

public class logicalOperators {
  public static void main(String[] args) {

    char c1 = 'A';
    char c2 = 65;
    int i1 = 5;
    int i2 = 10;
    boolean res1 =(i1==i2)&&(c1==c2); // F && ... = F
    System.out.println(res1);
    boolean res2 =(c1==c2)||(i1==i2); // T || ... = T
    System.out.println(res2);
    boolean res3 =(c1==c2)^(i1==i2); // T ^ F = T
    boolean res4 =(c1==c2)^(i1!=i2); // T ^ T = F
    System.out.println(res3);
    System.out.println(res4);
  }
}
