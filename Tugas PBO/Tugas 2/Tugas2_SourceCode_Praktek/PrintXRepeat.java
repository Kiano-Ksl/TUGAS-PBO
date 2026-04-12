/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi Putra
 * Kelas            : A3
 * Hari/Tanggal     : Minggu, 12 April 2026
 * Waktu Pengerjaan : 17:15 WITA
 */

import java.util.Scanner;

public class PrintXRepeat {
    public static void main(String[] args) {
        /* Kamus : */
        int Sum;
        int x;
        Scanner masukan = new Scanner(System.in);
        
        /* Program */
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Elmt */
        
        if (x == 999) {
            System.out.print("Kasus kosong \n");
        } else { 
            Sum = 0; /* Inisialisasi */
            do {
                Sum = Sum + x; /* Proses */
                System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); /* Next Elmt */
            } while (x != 999); /* Kondisi pengulangan */
            
            System.out.println ("Hasil penjumlahan = "+Sum);
        }
    }
}