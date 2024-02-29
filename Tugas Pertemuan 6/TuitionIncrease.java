public class TuitionIncrease {
  public static void main(String[] args) {

      double UKT = 8000.0;

      System.out.println("Tahun\tProyeksi UKT");
      
      for (int tahun = 1; tahun <= 5; tahun++) {
          UKT += UKT * 0.03; 
          
          System.out.printf("%d\t$%.2f\n", tahun, UKT);
      }
  }
}
