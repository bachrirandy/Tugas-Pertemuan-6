import java.util.Scanner;

public class SumOfNumbers {
  public static void main(String[] args) {
    int jumlah = 0;

    Scanner scanner = new Scanner(System.in);
    
    while (true) {
        System.out.print("Masukkan bilangan positif (Masukkan angka negatif untuk mengakhiri): ");
        int bilangan = scanner.nextInt();
        
        if (bilangan >= 0) {
            jumlah += bilangan;
        } else {
            break;  
        }
    }
    
    System.out.println("Jumlah bilangan positif: " + jumlah);
    
    scanner.close();
  }
}
