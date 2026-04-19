/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi' Putra
 * Kelas            : A3
 * Hari/Tanggal     : Jummat, 17 April 2026
 * Waktu Pengerjaan : 14:30 WITA
 */

import java.util.Scanner;

class Kalkulator {
    private double angka1;
    private double angka2;
    private char operator;

    // Konstruktor: Menerima 3 parameter sesuai Class Diagram
    public Kalkulator(double a1, double a2, char op) {
        this.angka1 = a1;
        this.angka2 = a2;
        this.operator = op;
    }

    public double tambah() { return angka1 + angka2; }
    public double kurang() { return angka1 - angka2; }
    public double kali() { return angka1 * angka2; }
    public double bagi() { return angka1 / angka2; }

    // Method tampilHasil: Switch-case dipusatkan di sini sesuai perintah modul
    public void tampilHasil() {
        double hasil = 0;
        boolean valid = true;

        switch (operator) {
            case '+': hasil = tambah(); break;
            case '-': hasil = kurang(); break;
            case '*': hasil = kali(); break;
            case '/':
                if (angka2 == 0) {
                    System.out.println("Error: pembagian dengan nol!");
                    valid = false;
                } else {
                    hasil = bagi();
                }
                break;
            default:
                System.out.println("Operator tidak dikenal");
                valid = false;
        }

        if (valid) {
            System.out.printf("Hasil: %.2f %c %.2f = %.2f\n", angka1, operator, angka2, hasil);
        }
    }
}

public class MainKalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char lagi;
        
        do {
            System.out.print("Angka 1 : ");
            double a1 = sc.nextDouble();
            System.out.print("Angka 2 : ");
            double a2 = sc.nextDouble();
            System.out.print("Operator (+,-,*,/): ");
            char op = sc.next().charAt(0);

            // Instansiasi objek Kalkulator
            Kalkulator kal = new Kalkulator(a1, a2, op);
            kal.tampilHasil();

            System.out.print("Hitung lagi? (y/n): ");
            lagi = sc.next().charAt(0);
        } while (lagi == 'y' || lagi == 'Y');
        
        System.out.println("Program selesai.");
        sc.close();
    }
}