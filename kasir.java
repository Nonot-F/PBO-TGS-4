
package tugas4;
import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah memiliki kartu member? (ya/tidak): ");
        String member = input.nextLine();

        System.out.print("Masukkan total belanja: Rp");
        double belanja = input.nextDouble();

        System.out.print("Masukkan uang pembayaran: Rp");
        double pembayaran = input.nextDouble();

        double diskon = 0;

        if (member.equalsIgnoreCase("ya")) {
            if (belanja > 500000) {
                diskon = 50000;
            } else if (belanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (belanja > 100000) {
                diskon = 10000;
            }
        }

        double totalBayar = belanja - diskon;
        double kembalian = pembayaran - totalBayar;

        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Total Belanja: Rp" + belanja);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total yang Harus Dibayar: Rp" + totalBayar);

        if (pembayaran >= totalBayar) {
            System.out.println("Uang Pembayaran: Rp" + pembayaran);
            System.out.println("Kembalian: Rp" + kembalian);
        } else {
            System.out.println("Uang kurang: Rp" + (-kembalian));
        }
    }
}
