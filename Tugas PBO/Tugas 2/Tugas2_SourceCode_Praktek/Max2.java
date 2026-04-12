/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi Putra
 * Kelas            : A3
 * Hari/Tanggal     : Minggu, 12 April 2026
 * Waktu Pengerjaan : 15:30 WITA
 */

import java.util.Scanner;

public class Max2 {
    public static void main(String[] args) {
        /* Kamus */
        int a, b;
        Scanner masukan = new Scanner(System.in);
        
        /* Program */
        System.out.print ("Maksimum dua bilangan : \n");
        System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
        a = masukan.nextInt();
        b = masukan.nextInt();
        System.out.println ("Ke dua bilangan : a = "+ a+" b = "+b);
        
        if (a >= b) {
            System.out.println ("Nilai a yang maksimum "+ a);
        } else {
            System.out.println ("Nilai b yang maksimum: "+ b);
        }
    }
}