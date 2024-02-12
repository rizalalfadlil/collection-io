import java.io.*;
import java.util.*;

public class Penugasan9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double panjang, lebar, tinggi;
        try {
            System.out.print("Masukkan nilai panjang balok kayu (harus lebih besar dari lebar dan tinggi): ");
            panjang = input.nextDouble();
            System.out.print("Masukkan nilai lebar balok kayu (tidak boleh lebih besar dari panjang): ");
            lebar = input.nextDouble();
            System.out.print("Masukkan nilai tinggi balok kayu(tidak boleh lebih besar dari tinggi): ");
            tinggi = input.nextDouble();
            input.close();
            if (panjang > lebar && lebar > tinggi) {
                double volume = panjang * lebar * tinggi;
                System.out.println("Volume balok kayu yang Anda beli adalah: " + volume + " satuan kubik");
                FileWriter file = new FileWriter("volume-balok-kayu.txt");
                file.write("Volume balok kayu yang Anda beli adalah: " + volume + " satuan kubik");
                file.close();
                System.out.println("Hasil perhitungan volume balok kayu telah disimpan ke file volume-balok-kayu.txt");
            } else {
                System.out.println("Nilai panjang, lebar, dan tinggi balok kayu tidak memenuhi syarat. Harap masukkan nilai yang valid.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input bukan angka. Harap masukkan angka yang valid.");
        } catch (IOException e) {   
            System.out.println("Terjadi kesalahan saat menulis ke file. Harap periksa kembali file Anda.");
        }
    }
}
