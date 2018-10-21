/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk mencetak nama
 */
public class PBO310117107Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer print = new Printer();
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        print.setNama(scanner.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        print.setJmlCetak(scanner.nextInt());
        
        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama());
    }
    
}
