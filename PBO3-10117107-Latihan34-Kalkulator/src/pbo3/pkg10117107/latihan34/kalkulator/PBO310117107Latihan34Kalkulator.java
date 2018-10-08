/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan34.kalkulator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menampilkan kalkulator
 */
public class PBO310117107Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Kalkulator kal = new Kalkulator();
    
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.println("Masukkan Angka ke-1: ");
        kal.value1 = scanner.nextDouble();
        System.out.println("Masukkan Angka ke-2: ");
        kal.value2 = scanner.nextDouble();
        
        DecimalFormat df = new DecimalFormat("###.##");
        
        System.out.println("\n Hasil Penjumlahan: " + kal.tambahBilangan());
        System.out.println("Hasil Pengurangan: " + kal.kurangBilangan());
        System.out.println("Hasil Perkalian: " + kal.kaliBilangan());
        System.out.println("Hasil Pembagian: " + df.format(kal.bagiBilangan()));
        System.out.println("Hasil Sisa: " + kal.sisaBilangan());
    }
    
}
