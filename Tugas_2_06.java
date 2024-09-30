import java.util.Scanner;

public class Tugas_2_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam kerja: ");
        double jamKerja = input.nextDouble();
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = input.nextDouble();

        double gajiSebelumBonus = jamKerja * upahPerJam;
        double bonus = 0.1 * gajiSebelumBonus;
        double gajiSetelahBonus = gajiSebelumBonus + bonus;
        double pajak = 0.05 * gajiSetelahBonus;
        double gajiBersih = gajiSetelahBonus - pajak;

        System.out.println("\nHasil Perhitungan Gaji:");
        System.out.println("Gaji sebelum bonus dan pajak: " + gajiSebelumBonus);
        System.out.println("Bonus (10%): Rp " + bonus);
        System.out.println("Gaji setelah bonus (sebelum pajak): Rp " + gajiSetelahBonus);
        System.out.println("Pajak (5%): Rp " + pajak);
        System.out.println("Gaji bersih: Rp " + gajiBersih);
    }
}
