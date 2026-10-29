
package tugas4;
import java.util.Scanner;

public class Gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan kode golongan (1-4): ");
        int golongan = input.nextInt();
        input.nextLine();

        System.out.print("Status pernikahan (menikah/belum): ");
        String status = input.nextLine();

        System.out.print("Jumlah anak: ");
        int anak = input.nextInt();

        double gajiPokok;

        switch (golongan) {
            case 1:
                gajiPokok = 1200000;
                break;
            case 2:
                gajiPokok = 1500000;
                break;
            case 3:
                gajiPokok = 1750000;
                break;
            case 4:
                gajiPokok = 2000000;
                break;
            default:
                System.out.println("Golongan tidak valid");
                return;
        }

        double tunjanganPasangan = 0;
        double tunjanganAnak = 0;

        if (status.equalsIgnoreCase("menikah")) {
            tunjanganPasangan = gajiPokok * 10 / 100;
        }

        if (anak > 0) {
            tunjanganAnak = gajiPokok * 5 / 100 * anak;
        }

        double totalTunjangan =
                tunjanganPasangan + tunjanganAnak;

        double gajiBersih = gajiPokok + totalTunjangan;

        System.out.println("\n=== DATA GAJI KARYAWAN ===");
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Tunjangan Pasangan: Rp" + tunjanganPasangan);
        System.out.println("Tunjangan Anak: Rp" + tunjanganAnak);
        System.out.println("Total Tunjangan: Rp" + totalTunjangan);
        System.out.println("Gaji Bersih: Rp" + gajiBersih);
    }
  }
 
