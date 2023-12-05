public class Q2_smallest_no {

  public static void main(String args[]) {
    int a = 10;
    int b = 15;
    int c = 20;

    var result = (a < b) ? (a < c) ? (a + " is smallest no.") : (c + " is smallest no.")
        : (b < c) ? (b + " is smallest no.") : (c + " is smallet no.");

    System.out.println(result);
  }
}
