public class OceanLevels {
  public static void main(String[] args) {
      // Initial ocean level in millimeters
      double oceanLevel = 0.0;
      
      // Ocean level rises 1.6 millimeters per year
      double risePerYear = 1.6;
      
      // Display the header
      System.out.println("Year\tOcean Level (mm)");
      System.out.println("-----------------------");
      
      // Loop to calculate and display ocean levels for 25 years
      for (int year = 1; year <= 25; year++) {
          oceanLevel += risePerYear;
          System.out.printf("%d\t%.1f\n", year, oceanLevel);
      }
  }
}
