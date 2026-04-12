/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi Putra
 * Kelas            : A3
 * Hari/Tanggal     : Minggu, 12 April 2026
 * Waktu Pengerjaan : 17:30 WITA
 */

import java.util.Scanner;

public class PrintXWhile {
    public static void main(String[] args) {
        /* Kamus : */
        int Sum;
        int x;
        Scanner masukan = new Scanner(System.in);
        
        /* Program */
        Sum = 0; /* Inisialisasi */
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt();/* First Elmt*/
        
        while (x != 999) { 
            Sum = Sum + x; /* Proses */
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
            x = masukan.nextInt();/* Next Elmt*/
        }
        System.out.println("Hasil penjumlahan = "+ Sum); 
    }
}