public class Q2_weekday {

  public static void main(String args[]) {
    int week_no = 5;

    switch (week_no) {
      case 1:
        System.out.println("it's Sunday");
        break;
      case 2:
        System.out.println("it's Monday");
        break;
      case 3:
        System.out.println("it's Tuesday");
        break;
      case 4:
        System.out.println("it's Wednesday");
        break;
      case 5:
        System.out.println("it's Thursday");
        break;
      case 6:
        System.out.println("it's Friday");
        break;
      case 7:
        System.out.println("it's Saturday");
        break;
      default:
        System.out.println("Invalid input");
        break;
    }
  }
}
