/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi Putra
 * Kelas            : A3
 * Hari/Tanggal     : Minggu, 12 April 2026
 * Waktu Pengerjaan : 17:45 WITA
 */

import java.util.Scanner;

public class SubProgram {
    
    /* Fungsi */
    public static int maxab (int a, int b){
        /* mencari maksimum dua bilangan bulat */
        return ((a >= b) ? a : b);
    }
    
    /* Prosedur */
    public static void tukar (int a, int b) { 
        /* menukar dua bilangan bulat */
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println ("Ke dua bilangan setelah tukar: a = "+ a +" b = "+ b);
    }
    
    /*** Program Utama ***/
    public static void main(String[] args) {
        /* Kamus */
        int a, b;
        Scanner masukan = new Scanner(System.in);
        
        /* Program */
        System.out.print ("Maksimum dua bilangan \n");
        System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
        a = masukan.nextInt();
        b = masukan.nextInt();
        System.out.println ("Ke dua bilangan : a = "+ a +" b = "+ b);
        
        System.out.println ("Maksimum = " + (maxab (a, b)));
        
        System.out.print("Tukar kedua bilangan... \n");
        tukar (a, b);
    }
}