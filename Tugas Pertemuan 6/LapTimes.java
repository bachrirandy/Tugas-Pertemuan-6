import java.util.Scanner;

public class LapTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berapa kali anda telah mengelilingi race track: ");
        int jumlahLap = scanner.nextInt();

        double waktuTotal = 0;
        double waktuTercepat = Double.MAX_VALUE;
        double waktuTerlambat = Double.MIN_VALUE;

        for (int i = 1; i <= jumlahLap; i++) {
            System.out.print("Masukkan waktu lap " + i + " (dalam detik): ");
            double waktuLap = scanner.nextDouble();

            waktuTotal += waktuLap;

            if (waktuLap < waktuTercepat) {
                waktuTercepat = waktuLap;
            }

            if (waktuLap > waktuTerlambat) {
                waktuTerlambat = waktuLap;
            }
        }

        double rataRataWaktu = waktuTotal / jumlahLap;

        System.out.println("Waktu lap tercepat: " + waktuTercepat + " detik");
        System.out.println("Waktu lap terlambat: " + waktuTerlambat + " detik");
        System.out.println("Rata-rata waktu lap: " + rataRataWaktu + " detik");

        scanner.close();
    }
}
