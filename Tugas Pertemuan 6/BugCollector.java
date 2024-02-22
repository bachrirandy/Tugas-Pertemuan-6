import java.util.Scanner;

public class BugCollector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah hari: ");
        int bugPerHari = input.nextInt();

        int totalBug = 0;

        for (int i = 1; i <= bugPerHari; i++) {
            System.out.print("Masukkan jumlah bug yang dikumpulkan pada hari ke-" + i + ": ");
            int bugsPerHari = input.nextInt();
            totalBug += bugsPerHari;
        }

        System.out.println("Total bug yang dikumpulkan dalam " + bugPerHari + " hari: " + totalBug);

        input.close();
    }
}
