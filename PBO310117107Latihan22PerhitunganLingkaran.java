/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA              : Muhammad Bariq A
 * KELAS             : PBO3
 * NIM               : 10117107
 * Deskripsi Program : Program ini menampilkan perhitungan lingkaran
 */
public class PBO310117107Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double phi, jari, luas, keliling;
       String diameter;
       phi = 3.14;
       boolean ulang = true;
       
       Scanner scanner = new Scanner(System.in);
       
        while (ulang == true) {
            System.out.println("======Perhitungan Lingkaran======");
            System.out.println("Masukkan nilai diameter lingkaran: ");
diameter = scanner.next();

if (diameter.matches("[0-9]*")){
    double d = Double.parseDouble(diameter);
    jari = d/2;
    luas = phi * (Math.pow(jari,2));
    keliling = 2*phi*jari;
    System.out.println("======Perhitungan Lingkaran======");
    System.out.println("Jari - jari Lingkaran = " +jari);
    System.out.println("Luas Lingkaran = "+luas);
    System.out.println("Keliling Lingkaran = "+keliling);
    ulang = false;
} else{
    System.out.println("Nilai Diameter Tidak Sesuai");
    }
            
        }
        
    }
    
}
