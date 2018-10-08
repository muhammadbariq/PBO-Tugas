/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menampilkan rata rata
 *                        nilai mahasiswa
 */
public class PBO310117107Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mah = new Mahasiswa();
        Scanner scan = new Scanner(System.in);
        
        int n;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = scan.nextInt();
        
        mah.HitungTotal(mah.nilaiMhs, n);
        mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n);
        
        System.out.print("\nMaka, Rata-Rata Nilainya adalah :" +
                mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n));
                
    }
    
}
