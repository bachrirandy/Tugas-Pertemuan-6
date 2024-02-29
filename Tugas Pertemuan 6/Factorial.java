import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input dari pengguna
        System.out.print("Masukkan bilangan non-negatif: ");
        int bilangan = scanner.nextInt();
        
        // Validasi input
        if (bilangan < 0) {
            System.out.println("Error: Harap masukkan bilangan non-negatif.");
        } else {
            // Menghitung faktorial menggunakan BigInteger
            BigInteger faktorial = BigInteger.ONE;
            for (int i = 1; i <= bilangan; i++) {
                faktorial = faktorial.multiply(BigInteger.valueOf(i));
            }
            
            // Menampilkan hasil faktorial
            System.out.println("Faktorial dari " + bilangan + " adalah: " + faktorial);
        }
        
        scanner.close();
    }
}
