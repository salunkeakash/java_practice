public class Q12_factorial {

  public static void main(String args[]) {
    int fact = 1;
    int i = 1;
    int num = 123;
 
    for(int i = 1; i <= num; i++ ) 
    {
      fact = fact * i;
    }

    System.out.println("\nFactorial of " + num + " is: " + fact);
  }
}
