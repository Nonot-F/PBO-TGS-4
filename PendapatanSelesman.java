
package tugas4;
import java.util.Scanner;

public class PendapatanSelesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total penjualan: Rp");
        double penjualan = input.nextDouble();

        double jasa;
        double komisi;

        if (penjualan <= 2000000) {
            jasa = 100000;
            komisi = penjualan * 10 / 100;
        } else if (penjualan <= 5000000) {
            jasa = 200000;
            komisi = penjualan * 15 / 100;
        } else {
            jasa = 300000;
            komisi = penjualan * 20 / 100;
        }

        double pendapatan = jasa + komisi;

        System.out.println("Total Penjualan: Rp" + penjualan);
        System.out.println("Uang Jasa: Rp" + jasa);
        System.out.println("Uang Komisi: Rp" + komisi);
        System.out.println("Total Pendapatan: Rp" + pendapatan);
    }
}
