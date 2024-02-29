public class MilesToKm {
  public static void main(String[] args) {
      // Header
      System.out.println("MIL\tKILOMETER");
      
      for (int mil = 10; mil <= 80; mil += 10) {
          double kilometer = mil * 1.60934;
          System.out.printf("%d\t%.2f\n", mil, kilometer);
      }
  }
}
