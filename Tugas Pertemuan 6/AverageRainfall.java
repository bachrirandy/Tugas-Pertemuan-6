import java.util.Scanner;

public class  AverageRainfall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah tahun: ");
        int jumlahTahun = scanner.nextInt();

        int totalBulan = jumlahTahun * 12; 
        double totalCurahHujan = 0; 

        // Outer loop for each year
        for (int tahun = 1; tahun <= jumlahTahun; tahun++) {
            // Inner loop for each month
            for (int bulan = 1; bulan <= 12; bulan++) {
                System.out.print("Masukkan inci curah hujan untuk Tahun " + tahun + ", Bulan " + bulan + ": ");
                double curahHujan = scanner.nextDouble();
                totalCurahHujan += curahHujan;
            }
        }

        double rataRataCurahHujan = totalCurahHujan / totalBulan;

        System.out.println("Jumlah bulan: " + totalBulan);
        System.out.println("Total inci curah hujan: " + totalCurahHujan);
        System.out.println("Rata-rata curah hujan per bulan: " + rataRataCurahHujan);

        scanner.close();
    }
}
