public class Q8 {

  public static void main(String args[]) {
    for (int i = 5; i >= 1; i--) {
      //   System.out.println(i);
      for (int j = 5; j >= 1; j--) {
        if (j <= i) {
          System.out.print(j + " ");
        }
      }
      System.out.println(" ");
    }
  }
}
