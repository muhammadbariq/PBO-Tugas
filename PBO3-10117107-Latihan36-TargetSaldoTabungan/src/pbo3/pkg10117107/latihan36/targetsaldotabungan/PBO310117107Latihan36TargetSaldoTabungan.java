/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan36.targetsaldotabungan;

/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menampilkan saldo
 *                        tabungan
 */
public class PBO310117107Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan tab = new Tabungan();
        
        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;
        
        tab.hitungLamaTarget(tab.saldo, saldoTarget);
    }
    
}
