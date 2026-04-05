/*
 *Koded 5
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi' Putra
 * Kelas            : A3
 * Hari/Tanggal     : Jumat, 3 April 2026
 * Waktu Pengerjaan : 14:45 WITA
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.Console;
import javax.swing.JOptionPane;

public class Bacakar {
    public static void main(String[] args) throws IOException {
        /* Kamus */
        char cc; 
        int bil;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        
        /* Algoritma */
        System.out.print("hello\n");
        System.out.print("baca 1 karakter : ");
        cc = dataIn.readLine().charAt(0);
        
        System.out.print("baca 1 bilangan : ");
        bil = Integer.parseInt(datAIn.readLine());
        
        System.out.print(cc + "\n" + bil + "\n");
        System.out.print("bye \n");
        
        /* Tambahan program membaca/input data */
        System.out.println("\n--- Eksekusi Tambahan Input ---");
        
        Scanner masukanScanner = new Scanner(System.in);
        System.out.print("Input kata pakai Scanner : ");
        String kataScanner = masukanScanner.next();
        System.out.println("Hasil Scanner : " + kataScanner);
        
        Console konsol = System.console();
        if (konsol != null) {
            String kataConsole = konsol.readLine("Input kata pakai Console : ");
            System.out.println("Hasil Console : " + kataConsole);
        } else {
            System.out.println("Fungsi Console tidak didukung di environment ini.");
        }
        
        String kataJOP = JOptionPane.showInputDialog("Input kata pakai JOptionPane :");
        JOptionPane.showMessageDialog(null, "Hasil input kamu: " + kataJOP);
    }
}