/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi Putra
 * Kelas            : A3
 * Hari/Tanggal     : Minggu, 12 April 2026
 * Waktu Pengerjaan : 18:00 WITA
 */

import java.util.Scanner;

public class Tempair {
    public static void main(String[] args) {
        /* Kamus : */
        int T;
        Scanner masukan = new Scanner(System.in);
        
        /* Program */
        System.out.print ("Contoh IF tiga kasus \n");
        System.out.print ("Temperatur (der. C) = ");
        T = masukan.nextInt();
        
        if (T < 0) {
            System.out.print ("Wujud air beku \n"+ T);
        } else if ((0 <= T) && (T <= 100)){
            System.out.print ("Wujud air cair \n"+ T);
        } else if (T > 100){
            System.out.print ("Wujud air uap/gas \n"+ T);
        }
    }
}