/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menampilkan nilai
 *                        mahasiswa
 */
public class PBO310117107Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        
        IndexNilai objI = new IndexNilai();
        
        System.out.print("QUIZ                      = ");
        objI.setQuis(scan1.nextDouble());
        System.out.print("UTS                       = ");
        objI.setUts(scan2.nextDouble());
        System.out.print("UAS                       = ");
        objI.setUas(scan3.nextDouble());
        
        System.out.println("");
        System.out.println("Nilai Akhir = "+objI.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");
        

    }
    
}
