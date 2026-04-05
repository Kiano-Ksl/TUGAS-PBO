/*
 *kode 4
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi' Putra
 * Kelas            : A3
 * Hari/Tanggal     : Jumat, 3 April 2026
 * Waktu Pengerjaan : 14:30 WITA
 */

import java.util.Scanner;

public class BacaData {
    public static void main(String[] args) {
        /* Kamus */
        int a;
        Scanner masukan;
        
        /* Program */
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        
        a = masukan.nextInt(); 
        System.out.print ("Nilai yang dibaca : "+ a);
    }
}