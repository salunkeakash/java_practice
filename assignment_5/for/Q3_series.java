public class Q3_series {

  public static void main(String args[]) {
    int i = 1;

    for (int n = 1; n < 20; n++) {
      if (i % 2 == 1) {
        System.out.println(n);
        n += 3;
      } else {
        System.out.println(n);
        n -= 1;
      }
    }
  }
}
