/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan44.hukumohm;

/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menampilkan kuat
 *                        tegangan
 */
public class PBO310117107Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai baterai = new Baterai();
        Baterai ohm = new Baterai(3,12);
        System.out.println("Kuat Arus : " + ohm.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + ohm.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + ohm.hitungTegangan()+ " volt");
        
    }
    
}
