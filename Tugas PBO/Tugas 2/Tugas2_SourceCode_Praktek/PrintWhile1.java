/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi Putra
 * Kelas            : A3
 * Hari/Tanggal     : Minggu, 12 April 2026
 * Waktu Pengerjaan : 16:45 WITA
 */

import java.util.Scanner;

public class PrintWhile1 {
    public static void main(String[] args) {
        /* Kamus : */
        int N;
        int i = 1;
        Scanner masukan = new Scanner(System.in);
        
        /* Program */
        System.out.print ("Nilai N >0 = ");
        N = masukan.nextInt();
        
        System.out.print ("Print i dengan WHILE (ringkas): \n");
        while (i <= N){
            System.out.println (i++);
        } 
    }
}