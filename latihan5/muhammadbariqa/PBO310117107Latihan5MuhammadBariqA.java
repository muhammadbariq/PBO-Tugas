/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan5.muhammadbariqa;

/**
 *
 * @author
 *  Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menghitung jumlah
 *                        kambing setelah ditambah 5
 */
public class PBO310117107Latihan5MuhammadBariqA {

    //variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    } 
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambah = " + jumlahKambing );
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PBO310117107Latihan5MuhammadBariqA kambingSusu= new PBO310117107Latihan5MuhammadBariqA(); {
        
            
            //Menapilkan jumlah kambing yag ada saat pemogramanpertama x berjalan
            kambingSusu.getJumlahKambing();
            
            //Menambah satu kambing
            kambingSusu.tambahKambing();
            
            //Menampilkan jumlah kambing yang ada
            kambingSusu.getJumlahKambing();
        };
    }
    
}
