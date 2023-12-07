public class Q13_factor_of_number {

  public static void main(String args[]) {
    int n = 40, i = 1;
    while (i <= n) {
      if (n % i == 0) {
        System.out.printf(" %d ", i);
      }
      i++;
    }
  }
}
