public class NestedLoop15 {
  public static void main(String[] args) {

      // Untuk membuat ## di baris pertama
      for (int a = 0; a < 1; a++) {
          System.out.println("##"); 

          // Untuk mencetak # di setiap baris pertama
          for (int b = 0; b < 5; b++) {
              System.out.print("# ");

              // Untuk membuat spasi di antara #
              for (int c = 0; c < b; c++) {
                  System.out.print("  ");
              }
              // Mencetak # di akhir spasi dan pindah ke baris baru
              System.out.println("#");
          }
      }
  }
}