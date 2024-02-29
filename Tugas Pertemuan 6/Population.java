import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Jumlah awal organisme: ");
        double jumlahAwal = scanner.nextDouble();
        
        System.out.print("Rata-rata peningkatan harian (%): ");
        double persentasePeningkatanRataRata = scanner.nextDouble();
        
        System.out.print("Jumlah hari untuk berkembang biak: ");
        int jumlahHari = scanner.nextInt();
        
        // Menampilkan header tabel
        System.out.println("Hari\tPopulasi Aproksimatif");
        
        // Menghitung dan menampilkan data untuk setiap hari
        double ukuranPopulasi = jumlahAwal;
        for (int hari = 1; hari <= jumlahHari; hari++) {
            // Menampilkan data untuk hari ini
            System.out.println(hari + "\t" + ukuranPopulasi);
            // Menghitung ukuran populasi untuk hari berikutnya
            ukuranPopulasi += ukuranPopulasi * persentasePeningkatanRataRata / 100.0;
        }
        
        scanner.close();
    }
}
