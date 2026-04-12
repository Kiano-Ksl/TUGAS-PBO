/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi Putra
 * Kelas            : A3
 * Hari/Tanggal     : Minggu, 12 April 2026
 * Waktu Pengerjaan : 13:30 WITA
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BacaString {
    public static void main(String[] args) throws IOException {
        /* Kamus */
        String str;
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        
        /* Program */
        System.out.print ("\nBaca string dan Integer: \n");
        System.out.print("masukkan sebuah string: ");
        str= datAIn.readLine();
        System.out.print ("String yang dibaca : "+ str);
    }
}