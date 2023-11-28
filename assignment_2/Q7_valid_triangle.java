public class Q7_valid_triangle {

  public static void main(String args[]) {
    int side1 = 40;
    int side2 = 50;
    int side3 = 40;

    if (
      (side1 + side2) > side3 ||
      (side2 + side3) > side1 ||
      (side3 + side1) > side2
    ) {
      System.out.println("it is a valid triangle");
    } else {
      System.out.println("it is not a valid triangle");
    }
  }
}
