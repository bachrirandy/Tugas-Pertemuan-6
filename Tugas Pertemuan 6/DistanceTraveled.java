import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kecepatan kendaraan (mil per jam): ");
        double kecepatan = scanner.nextDouble();

        System.out.print("Masukkan jumlah jam yang telah ditempuh: ");
        int jam = scanner.nextInt();

        System.out.println("Jam\tJarak yang Ditempuh");
        System.out.println("----------------------");

        for (int jamSekarang = 1; jamSekarang <= jam; jamSekarang++) {
            double jarak = kecepatan * jamSekarang;
            System.out.printf("%d\t%.2f\n", jamSekarang, jarak);
        }

        scanner.close();
    }
}

