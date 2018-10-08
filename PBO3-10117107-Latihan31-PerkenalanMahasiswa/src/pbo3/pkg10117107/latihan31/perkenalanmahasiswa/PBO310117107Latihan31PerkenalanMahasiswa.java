/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan31.perkenalanmahasiswa;

/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menampilkan NIM dan
 *                       nama mahasiswa
 */
public class PBO310117107Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
      mhs1.nim = "10110269";
      mhs1.nama = "Rizki Adam Kurniawan \n";
      mhs1.perkenalkanDiri(mhs1.nim, mhs1.nama);
      
       mahasiswa mhs2 = new mahasiswa();
      mhs2.nim = "10110270";
      mhs2.nama = "Indra Tiola \n";
      mhs2.perkenalkanDiri(mhs2.nim, mhs2.nama);
      
       mahasiswa mhs3 = new mahasiswa();
      mhs3.nim = "10110271";
      mhs3.nama = "Robi Tanzil Ganefi \n";
      mhs3.perkenalkanDiri(mhs3.nim, mhs3.nama);
      
       mahasiswa mhs4 = new mahasiswa();
      mhs4.nim = "10110272";
      mhs4.nama = "Muhammad Nur Awaludin \n";
      mhs4.perkenalkanDiri(mhs4.nim, mhs4.nama);
    }
    
}
