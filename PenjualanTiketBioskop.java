import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hargatiket = 50000;  
        int totalTiketTerjual = 0;      
        double totalPendapatan = 0;    

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (atau 0 untuk selesai): ");
            int jumlahTiket = scanner.nextInt();
            
            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, coba lagi.");
                continue;
            }

            double hargaTotal = jumlahTiket * hargatiket;

            if (jumlahTiket > 10) {
                hargaTotal *= 0.85;  
            } else if (jumlahTiket > 4) {
                hargaTotal *= 0.90;  
            }

            totalTiketTerjual += jumlahTiket;
            totalPendapatan += hargaTotal;

            System.out.println("Harga yang harus dibayar: Rp " + hargaTotal);
        }

        System.out.println("\nTotal tiket terjual hari ini: " + totalTiketTerjual);
        System.out.println("Total pendapatan hari ini: Rp " + totalPendapatan);

    }
}