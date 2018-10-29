/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10117107.latihan61.bangunruang;

/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menampilkan kelompok
 *                        bangun ruang
 */
public class PBO10117107Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola b = new Bola();
        Tabung t = new Tabung();
        Kerucut k = new Kerucut();
        
        b.setR(7);
        System.out.println("Volume Bola : " + Math.ceil(b.hitungVolume()));
        
        t.setH(21);
        t.setR(10);
        System.out.println("Volume Tabung : " + Math.ceil(t.hitungVolume()));
        
        k.setR(14);
        k.setH(9);
        System.out.println("Volume Kerucut : " + Math.ceil(k.hitungVolume()));
    }
    
}
