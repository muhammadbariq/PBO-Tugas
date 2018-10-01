/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan23.nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author
 *  NAMA              : Muhammad Bariq A
 * KELAS             : PBO3
 * NIM               : 10117107
 * Deskripsi Program : Program ini menampilkan nilai terbesar dan terkecil
 */
public class PBO310117107Latihan23NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namaPtgs;
        int no, min, max, jumlahMhs;
        int[] nilai = new int[100];
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("=====Masukkan Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.println("Masukkan Nama Petugas: ");
        namaPtgs = scanner.next();
        System.out.println("Masukkan Banyaknya Nilai Mahasiswa");
        jumlahMhs = scanner.nextInt();
        
        for (no=1; no<=jumlahMhs; no++){
            System.out.println("Masukkan nilai Mahasiswa ke- " +no+" : ");
            nilai[no] = scanner.nextInt();
        }
        max = 0;
        min = 100;
        System.out.println("\n"+"=====Hasil Nilai Mahasiswa=====");
        for (no=1; no<=nilai[no]; no++){
            if(nilai[no]>max){
                max = nilai[no];
            }
            else if (nilai[no]<min){
                min=nilai[no];
            }
            System.out.println("Nilai Mahasiswa ke- "+no+ " : "+nilai[no]+"\n");
        }
        System.out.println("Nilai Terbesar Adalah : "+max);
        System.out.println("Nilai Terkecil Adalah : "+min);
        System.out.println("Petugas : "+namaPtgs);
    }
    
}
