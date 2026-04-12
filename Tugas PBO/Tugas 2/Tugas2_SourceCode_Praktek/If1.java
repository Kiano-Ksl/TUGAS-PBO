/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi Putra
 * Kelas            : A3
 * Hari/Tanggal     : Minggu, 12 April 2026
 * Waktu Pengerjaan : 14:00 WITA
 */

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        /* Kamus */
        Scanner masukan = new Scanner(System.in);
        int a;
        
        /* Program */
        System.out.print ("Contoh IF satu kasus \n");
        System.out.print ("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        
        if (a >= 0) {
            System.out.print ("\nNilai a positif "+ a);
        }
    }
}