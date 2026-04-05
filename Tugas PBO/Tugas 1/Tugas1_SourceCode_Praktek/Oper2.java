/*
 *kode13
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi' Putra
 * Kelas            : A3
 * Hari/Tanggal     : Jumat, 3 April 2026
 * Waktu Pengerjaan : 16:45 WITA
 */

public class Oper2 {
    public static void main(String[] args) {
        /* KAMUS */
        char i, j;
        
        /* ALGORITMA */
        i = 3; /* 00000011 dalam biner */
        j = 4; /* 00000100 dalam biner */
        
        System.out.println("i = " + (int) i);
        System.out.println("j = " + j);
        System.out.println("i & j = " + (i & j));
        System.out.println("i | j = " + (i | j));
        System.out.println("i ^ j = " + (i ^ j));
        System.out.println(Math.pow(i, j));
        System.out.println("~i = " + ~i);
    }
}