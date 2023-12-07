public class Q3_series {

  public static void main(String args[]) {
    int n = 1;
    int i = 1;

    while (n <= 20) {
      if (i % 2 == 1) {
        System.out.println(n);
        n += 3;
      } else {
        System.out.println(n);
        n -= 1;
      }
      i++;
    }
  }
}
