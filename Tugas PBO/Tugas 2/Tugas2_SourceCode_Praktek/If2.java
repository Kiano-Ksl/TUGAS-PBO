/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi Putra
 * Kelas            : A3
 * Hari/Tanggal     : Minggu, 12 April 2026
 * Waktu Pengerjaan : 14:15 WITA
 */

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        /* Kamus */
        int a;
        Scanner masukan = new Scanner(System.in);
        
        /* Program */
        System.out.print ("Contoh IF dua kasus \n");
        System.out.print ("Ketikkan suatu nilai integer :");
        a = masukan.nextInt();
        
        if (a >= 0) {
            System.out.println ("Nilai a positif "+ a);
        } else {
            System.out.println ("Nilai a negatif "+ a);
        }
    }
}