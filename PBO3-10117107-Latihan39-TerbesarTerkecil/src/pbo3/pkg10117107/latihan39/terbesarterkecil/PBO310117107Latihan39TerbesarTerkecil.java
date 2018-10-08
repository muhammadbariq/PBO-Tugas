/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan39.terbesarterkecil;

import java.util.Scanner;



/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menampilkan nilai
 *                        Terbesar dan Terkecil
 */
public class PBO310117107Latihan39TerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mahasiswa mhs1 = new Mahasiswa();
        Scanner scanner = new Scanner(System.in);
        
        int bykMah;
        String nama;
        System.out.println
        ("========Program Nilai Terbesar dan Terkecil nilai Mahasiswa========");
        System.out.print("Masukkan Nama Petugas : ");
        nama = scanner.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        bykMah = scanner.nextInt();
        mhs1.inputNilai(mhs1.nilai, bykMah);
        mhs1.tampilBesarKecil(mhs1.nilai, bykMah);
        
        System.out.println("\n"+"Petugas : " + nama);  
    }
    
}
