import java.util.Scanner;

public class Tugas_1_06 {
    public static void main(String[] args) {
         double TARIFF_PER_KWH = 1500.0, penggunaan, totalTagihan;
         int CEK_PENGGUNAAN = 500;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan penggunaan listrik dalam kWh: ");
         penggunaan = input.nextDouble();

         totalTagihan = penggunaan * TARIFF_PER_KWH;

        if (penggunaan > CEK_PENGGUNAAN) {
            System.out.println("Penggunaan Listrik melebihi 500kWh ");
        }
        System.out.println("Total tagihan Listrik: Rp "+ totalTagihan);

    }
}
