/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi Putra
 * Kelas            : A3
 * Hari/Tanggal     : Minggu, 12 April 2026
 * Waktu Pengerjaan : 17:00 WITA
 */

import java.util.Scanner;

public class PrintXinterasi {
    public static void main(String[] args) {
        /* Kamus : */
        int Sum = 0;
        int x;
        Scanner masukan = new Scanner(System.in);
        
        /* Program */
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Elmt */
        
        if (x == 999) {
            System.out.print ("Kasus kosong \n");
        } else { 
            Sum = x; /* Inisialisasi */
            for (;;) {
                System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); /* Next Elmt */
                if (x == 999) {
                    break;
                } else {
                    Sum = Sum + x; /* Proses */
                }
            }
        }
        System.out.println("Hasil penjumlahan = "+ Sum);
    }
}