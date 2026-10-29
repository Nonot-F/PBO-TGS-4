
package tugas4;
import java.util.Scanner;

public class LuasBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU LUAS BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Trapesium");
        System.out.println("5. Layang-layang");

        System.out.print("Pilih menu (1-5): ");
        int pilihan = input.nextInt();

        double luas;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();

                luas = sisi * sisi;
                System.out.println("Luas Persegi = " + luas);
                break;

            case 2:
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();

                luas = alas * tinggi / 2;
                System.out.println("Luas Segitiga = " + luas);
                break;

            case 3:
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();

                luas = 3.14 * r * r;
                System.out.println("Luas Lingkaran = " + luas);
                break;

            case 4:
                System.out.print("Masukkan sisi atas: ");
                double atas = input.nextDouble();

                System.out.print("Masukkan sisi bawah: ");
                double bawah = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();

                luas = (atas + bawah) * t / 2;
                System.out.println("Luas Trapesium = " + luas);
                break;

            case 5:
                System.out.print("Masukkan diagonal pertama: ");
                double d1 = input.nextDouble();

                System.out.print("Masukkan diagonal kedua: ");
                double d2 = input.nextDouble();

                luas = d1 * d2 / 2;
                System.out.println("Luas Layang-layang = " + luas);
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
