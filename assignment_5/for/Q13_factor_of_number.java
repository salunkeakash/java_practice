public class Q13_factor_of_number {

  public static void main(String args[]) {
    int n = 40, i = 1; 
      for(int i =1 ; i <= n; i++){
      if (n % i == 0) {
        System.out.printf(" %d ", i);
      }
      i++;
    }
  }
}
