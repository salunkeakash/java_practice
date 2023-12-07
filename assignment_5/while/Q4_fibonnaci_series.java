public class Q4_fibonnaci_series {

  public static void main(String args[]) {
    int a = 0, b = 1;
    int nextval;
    int i = 2;

    System.out.print(a);
    System.out.print(b);

    while (i < 20) {
      nextval = a + b;
      a = b;
      b = nextval;
      if (nextval < 100) {
        System.out.print(nextval);
      } else {
        break;
      }
      i++;
    }
  }
}
