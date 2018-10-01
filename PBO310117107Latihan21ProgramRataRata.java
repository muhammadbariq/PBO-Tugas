/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan21.programratarata;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA              : Muhammad Bariq A
 * KELAS             : PBO3
 * NIM               : 10117107
 * Deskripsi Program : Program ini menampilkan rata rata nilai
 */
public class PBO310117107Latihan21ProgramRataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double jumlahMhsw, rata;
        int[] nilai = new int[100];
        
        Scanner scanner = new  Scanner(System.in);
        
        System.out.println("Masukkan Banyaknya Mahasiswa : ");
        jumlahMhsw = scanner.nextInt();
        int jumlah = 0;
        for (int nomer=1; nomer<=jumlahMhsw; nomer++){
            System.out.println("Nilai mahasiswa ke- " +nomer+" : ");
            nilai[nomer] = scanner.nextInt();
            jumlah+=nilai[nomer];
        }
        rata = jumlah/jumlahMhsw;
        
        System.out.println("Maka, Rata - rata Nilainya adalah " +rata+"\n");
    }
    
}
