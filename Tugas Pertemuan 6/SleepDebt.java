import java.util.Scanner;

public class SleepDebt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahHari = 7;
        int tidurIdealPerHari = 8;
        int totalTidur = 0;

        // Meminta pengguna memasukkan jumlah jam tidur per hari selama 7 hari
        for (int hari = 1; hari <= jumlahHari; hari++) {
            System.out.print("Masukkan jumlah jam tidur untuk Hari ke-" + hari + ": ");
            int jamTidur = scanner.nextInt();
            totalTidur += jamTidur;
        }

        // Menghitung hutang tidur
        int hutangTidur = (jumlahHari * tidurIdealPerHari) - totalTidur;

        if (hutangTidur > 0) {
            System.out.println("Total jam tidur selama seminggu: " + totalTidur);
            System.out.println("Hutang tidur Anda: " + hutangTidur + " jam");
            System.out.println("Jangan lupa meluangkan waktu lebih buat tidur ya!");
        } else {
            System.out.println("Anda tidak memiliki hutang tidur!!??? menggokil! iri bgt gweh tch!");
        }

        scanner.close();
    }
}
