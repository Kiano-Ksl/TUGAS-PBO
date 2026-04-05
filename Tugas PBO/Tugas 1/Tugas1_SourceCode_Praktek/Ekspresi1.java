/*
 *kode 9
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi' Putra
 * Kelas            : A3
 * Hari/Tanggal     : Jumat, 3 April 2026
 * Waktu Pengerjaan : 15:45 WITA
 */

public class Ekspresi1 {
    public static void main(String[] args) {
        /* KAMUS */
        int x = 1; 
        int y = 2; 
        float fx; 
        float fy;
        
        /* ALGORITMA */
        System.out.print ("x/y (format integer) = " + x/y);
        System.out.print ("\nx/y (format float) = " + x/y);
        
        fx = x;
        fy = y;
        System.out.print ("\nx/y (format integer) = " + fx/fy);
        System.out.print ("\nx/y (format float) = " + fx/fy);
        
        System.out.print("\nfloat(x)/float(y) (format integer) = " + (float)x/(float)y);
        System.out.print("\nfloat(x)/float(y) (format float) = " + (float)x/(float)y);
        
        x = 10; 
        y = 3;
        System.out.print ("\nx/y (format integer) = " + x/y);
        System.out.print ("\nx/y (format float) = " + x/y);
    }
}