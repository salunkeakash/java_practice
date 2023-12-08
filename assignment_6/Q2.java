public class Q2 {

  public static void main(String args[]) {
    for (int i = 1; i <= 5; i++) {
      //   System.out.println(i);
      for (int j = 1; j <= 5; j++) {
        if (i == 1 || i == 5) {
          System.out.print("1 ");
        } else {
            if(j == 1 || j == 5 )
            {
                System.out.print("1 ");
            }else
            {
                System.out.print("0 ");
            }
          
        }
      }
      System.out.println(" ");
    }
  }
}
