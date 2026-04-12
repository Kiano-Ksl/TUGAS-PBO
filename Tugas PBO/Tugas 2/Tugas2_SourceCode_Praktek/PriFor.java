/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi Putra
 * Kelas            : A3
 * Hari/Tanggal     : Minggu, 12 April 2026
 * Waktu Pengerjaan : 15:45 WITA
 */

import java.util.Scanner;

public class PriFor {
    public static void main(String[] args) {
        /* Kamus */
        int i, N;
        Scanner masukan = new Scanner(System.in);
        
        /* Program */
        System.out.print ("Baca N, print 1 s/d N ");
        System.out.print ("N = ");
        N = masukan.nextInt();
        
        for (i = 1; i <= N; i++){
            System.out.println (i); 
        };
        System.out.println ("Akhir program \n");
    }
}