/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan20.targetsaldo;

/**
 *
 * @author
 * NAMA              : Muhammad Bariq A
 * KELAS             : PBO3
 * NIM               : 10117107
 * Deskripsi Program : Program ini menampilkan target saldo dalam sebulan
 */
public class PBO310117107Latihan20TargetSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int saldoAwal, bulan;
        bulan = 0;
        double bunga;
        
        for (saldoAwal=3500000; saldoAwal<=6500000; saldoAwal+=bunga){
            bunga = saldoAwal*0.08;
           if (bulan != 0)
                System.out.println("Saldo di bulan ke-" + bulan + "Rp." 
                        + saldoAwal +"\n");
           bulan++;
            
        }
    }
    
}
