/*
 *kode 15
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi' Putra
 * Kelas            : A3
 * Hari/Tanggal     : Jumat, 3 April 2026
 * Waktu Pengerjaan : 17:15 WITA
 */

public class Oper4 {
    public static void main(String[] args) {
        /* KAMUS */
        int i = 0; 
        int j = 0;
        char c = 8; 
        char d = 10;
        
        int e = (((int)c > (int)d) ? c: d);
        int k = ((i > j) ? i: j);
        
        /* ALGORITMA */
        System.out.print ("Nilai e = " + e);
        System.out.print ("\nNilai k = " + k);
        
        i = 2;
        j = 3;
        k = ((i++ > j++) ? i: j) ;
        
        System.out.print ("\nNilai k = " + k);
    }
}