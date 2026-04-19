/*
 * NIM              : 13020240108
 * Nama             : Muhammad Widyadhana Rafi' Putra
 * Kelas            : A3
 * Hari/Tanggal     : Jummat, 17 April 2026
 * Waktu Pengerjaan : 16:30 WITA
 */

import java.util.Scanner;

class Buah {
    private String nama;
    private double harga;
    private int stok;

    public Buah(String n, double h, int s) {
        this.nama = n;
        this.harga = h;
        this.stok = s;
    }

    public String getInfo() {
        return nama + " Rp " + String.format("%,.0f", harga) + " (stok:" + stok + " kg)";
    }

    public double hitungTotal(int qty) {
        return harga * qty;
    }

    public boolean tersedia(int qty) {
        if (stok >= qty) {
            stok -= qty;
            return true;
        }
        return false;
    }
}

public class TokoBuah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Buah[] katalog = new Buah[3];
        katalog[0] = new Buah("Apel", 15000, 10);
        katalog[1] = new Buah("Jeruk", 12000, 8);
        katalog[2] = new Buah("Mangga", 20000, 5);

        System.out.println("=== DAFTAR BUAH ===");
        for (int i = 0; i < katalog.length; i++) {
            System.out.println((i + 1) + ". " + katalog[i].getInfo());
        }

        double total = 0;
        int pilih;

        while (true) {
            System.out.print("\nPilih (0=stop): ");
            pilih = sc.nextInt();

            if (pilih == 0) break;

            if (pilih < 1 || pilih > 3) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            System.out.print("Jumlah(kg): ");
            int qty = sc.nextInt();

            Buah b = katalog[pilih - 1];

            if (b.tersedia(qty)) {
                double subTotal = b.hitungTotal(qty);
                total += subTotal;
                System.out.println("OK +Rp" + String.format("%,.0f", subTotal));
            } else {
                System.out.println("Stok tidak cukup!");
            }
        }
        
        System.out.println("Total belanja: Rp" + String.format("%,.0f", total));
        sc.close();
    }
}