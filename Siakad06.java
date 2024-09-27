import java.util.Scanner;
public class Siakad06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir, bobotKuis = 0.2, bobotTugas = 0.15, bobotUTS = 0.3, bobotUAS = 0.35;

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = input.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = input.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = input.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = input.nextDouble();
        nilaiAkhir = (nilaiKuis * bobotKuis) + (nilaiTugas * bobotTugas) + (nilaiUTS * bobotUTS) + (nilaiUAS * bobotUAS);
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ")" + " kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}
