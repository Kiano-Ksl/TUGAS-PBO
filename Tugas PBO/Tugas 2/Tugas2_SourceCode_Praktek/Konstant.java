/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi Putra
 * Kelas            : A3
 * Hari/Tanggal     : Minggu, 12 April 2026
 * Waktu Pengerjaan : 15:15 WITA
 */

import java.util.Scanner;

public class Konstant {
    public static void main(String[] args) {
        /* Kamus */
        final float PHI = 3.1415f;
        float r;
        Scanner masukan = new Scanner(System.in);
        
        /* program */ /* baca data */
        System.out.print ("Jari-jari lingkaran =");
        r = masukan.nextFloat();
        
        /* Hitung dan tulis hasil */
        System.out.print ("Luas lingkaran = "+ (PHI * r * r)+"\n");
        System.out.print ("Akhir program \n");
    }
}