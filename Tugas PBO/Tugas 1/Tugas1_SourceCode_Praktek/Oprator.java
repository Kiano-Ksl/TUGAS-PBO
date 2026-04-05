/*
 *kode 16
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi' Putra
 * Kelas            : A3
 * Hari/Tanggal     : Jumat, 3 April 2026
 * Waktu Pengerjaan : 17:30 WITA
 */

public class Oprator {
    public static void main(String[] args) {
        /* Kamus */
        boolean Bool1, Bool2, TF ;
        int i, j, hsl ;
        float x, y, res;
        
        /* algoritma */
        System.out.println("Menampilkan Output Operasi Dasar:");
        
        Bool1 = true; Bool2 = false;
        System.out.println("\n-- Operasi Boolean --");
        TF = Bool1 && Bool2 ; System.out.println("Bool1 && Bool2 = " + TF);
        TF = Bool1 || Bool2 ; System.out.println("Bool1 || Bool2 = " + TF);
        TF = ! Bool1 ; System.out.println("!Bool1 = " + TF);
        TF = Bool1 ^ Bool2; System.out.println("Bool1 ^ Bool2 = " + TF);
        
        /* operasi numerik */
        i = 5; j = 2 ;
        System.out.println("\n-- Operasi Numerik Integer (i=5, j=2) --");
        hsl = i + j; System.out.println("i + j = " + hsl);
        hsl = i - j; System.out.println("i - j = " + hsl);
        hsl = i / j; System.out.println("i / j = " + hsl);
        hsl = i * j; System.out.println("i * j = " + hsl);
        hsl = i % j; System.out.println("i % j = " + hsl); 
        
        /* operasi numerik pecahan */
        x = 5.0f ; y = 5.0f ;
        System.out.println("\n-- Operasi Numerik Float (x=5, y=5) --");
        res = x + y; System.out.println("x + y = " + res);
        res = x - y; System.out.println("x - y = " + res);
        res = x / y; System.out.println("x / y = " + res);
        res = x * y; System.out.println("x * y = " + res);
        
        /* operasi relasional numerik */
        System.out.println("\n-- Operasi Relasional Integer --");
        TF = (i == j); System.out.println("i == j : " + TF);
        TF = (i != j); System.out.println("i != j : " + TF);
        TF = (i < j); System.out.println("i < j  : " + TF);
        TF = (i > j); System.out.println("i > j  : " + TF);
        TF = (i <= j); System.out.println("i <= j : " + TF);
        TF = (i >= j); System.out.println("i >= j : " + TF);
        
        /* operasi relasional numerik float */
        System.out.println("\n-- Operasi Relasional Float --");
        TF = (x != y); System.out.println("x != y : " + TF);
        TF = (x < y); System.out.println("x < y  : " + TF);
        TF = (x > y); System.out.println("x > y  : " + TF);
        TF = (x <= y); System.out.println("x <= y : " + TF);
        TF = (x >= y); System.out.println("x >= y : " + TF);
    }
}