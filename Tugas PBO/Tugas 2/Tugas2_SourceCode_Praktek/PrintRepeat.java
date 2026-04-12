/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi Putra
 * Kelas            : A3
 * Hari/Tanggal     : Minggu, 12 April 2026
 * Waktu Pengerjaan : 16:15 WITA
 */

import java.util.Scanner;

public class PrintRepeat {
    public static void main(String[] args) {
        /* Kamus : */
        int N;
        int i;
        Scanner masukan = new Scanner(System.in);
        
        /* Program */
        System.out.print ("Nilai N >0 = ");
        N = masukan.nextInt();
        i = 1; 
        
        System.out.print ("Print i dengan REPEAT: \n");
        do {
            System.out.print (i+"\n"); /* Proses */
            i++; /* Next Elmt */
        } while (i <= N); /* Kondisi pengulangan */
    }
}