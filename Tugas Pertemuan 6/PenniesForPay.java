import java.util.Scanner;

public class PenniesForPay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = scanner.nextInt();
        
        if (jumlahHari < 1) {
            System.out.println("Error: Masukkan jumlah hari yang valid.");
        } else {
            double gajiHariPertama = 0.01; 
            double totalGaji = 0; 
            
            System.out.println("Hari\tGaji");
            System.out.println("---------------");
            
            for (int hari = 1; hari <= jumlahHari; hari++) {
                totalGaji += gajiHariPertama;
                
                System.out.printf("%d\t$%.2f\n", hari, gajiHariPertama);
                
                gajiHariPertama *= 2;
            }
            System.out.printf("Total Gaji: $%.2f\n", totalGaji);
        }
        scanner.close();
    }
}
