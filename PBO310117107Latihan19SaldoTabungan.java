/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan19.saldotabungan;

/**
 *
 * @author 
 * NAMA              : Muhammad Bariq A
 * KELAS             : PBO3
 * NIM               : 10117107
 * Deskripsi Program : Program ini menampilkan total saldo tabungan
 */
public class PBO310117107Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int saldoAwal, bulan;
        saldoAwal = 2500000;
        double bunga;
        
        for (bulan=0; bulan<=6; bulan++ ){
            bunga = saldoAwal*0.15;
            if (bulan != 0)
                System.out.println("Saldo di bulan ke-" + bulan + " Rp."+ saldoAwal +
                         "\n");
            saldoAwal+=bunga;
        }
    }
    
}
