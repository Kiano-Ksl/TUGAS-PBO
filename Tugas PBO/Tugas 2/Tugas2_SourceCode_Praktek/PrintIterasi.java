/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi Putra
 * Kelas            : A3
 * Hari/Tanggal     : Minggu, 12 April 2026
 * Waktu Pengerjaan : 16:00 WITA
 */

import java.util.Scanner;

public class PrintIterasi {
    public static void main(String[] args) {
        /* Kamus : */
        int N;
        int i;
        Scanner masukan = new Scanner(System.in);
        
        /* Program */
        System.out.print ("Nilai N >0 = "); /* Inisialisasi*/
        N = masukan.nextInt();
        i = 1; /* First Elmt */
        System.out.print ("Print i dengan ITERATE : \n");
        
        for (;;) {
            System.out.println(i); /* Proses */
            if (i == N) {
                /* Kondisi Berhenti */ break;
            } else {
                i++; /* Next Elmt */
            }
        } 
    }
}