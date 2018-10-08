/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan36.targetsaldotabungan;

/**
 *
 * @author
 */
public class Tabungan {
     public int saldo;
    public int bunga;

    public double hitungBunga(int parSaldo, int ParBunga) {
        return parSaldo * ParBunga / 100;
    }

    public void hitungLamaTarget(int parSaldo, int parSaldoTarget) {
        int i = 1;
        while (parSaldo <= parSaldoTarget) {
            hitungBunga(parSaldo, bunga);
            parSaldo += hitungBunga(parSaldo, bunga);
            
            String mataUang = String.format("Rp.%,3d", parSaldo).
                    replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-" + i + "%s%n", mataUang);
            i++;
        }
    }
}
