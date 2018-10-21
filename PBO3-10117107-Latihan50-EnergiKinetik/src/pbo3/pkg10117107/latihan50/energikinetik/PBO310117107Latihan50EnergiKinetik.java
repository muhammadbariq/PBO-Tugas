/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan50.energikinetik;

import java.text.DecimalFormat;

/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menghitung besar
 *                        energi kinetik dan besar usaha
 */
public class PBO310117107Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Energi kinetik = new Energi();
        kinetik.setMassa(0.145);
        kinetik.setKecepatan(25);
        kinetik.setKecepatanAwal(0);
        kinetik.setKecepatanAkhir(25);
        
        DecimalFormat df = new DecimalFormat("#.#");
        
        System.out.println("=====PROGRAM MENCARI ENERGI KINETIK=====");
        System.out.println("Energi Kinetik : " + df.format(
                           kinetik.hitungEnergiKinetik
                          (kinetik.getMassa(), kinetik.getKecepatan())));
        System.out.println("Usaha : " + df.format (kinetik.hitungUsaha
                          (kinetik.getKecepatanAwal(), 
                           kinetik.getKecepatanAkhir())));

    }
    
}
