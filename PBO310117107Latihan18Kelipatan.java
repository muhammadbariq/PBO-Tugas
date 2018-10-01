/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan18.kelipatan;

/**
 *
 * @author
 * NAMA              : Muhammad Bariq A
 * KELAS             : PBO3
 * NIM               : 10117107
 * Deskripsi Program : Program ini menampilkan kelipatan angka 3,5
 */
public class PBO310117107Latihan18Kelipatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double bilangan = 3.5;
        
        while (bilangan<=35) {
            if (bilangan != 0){
                System.out.println(bilangan);
            }
            bilangan+= 3.5;
        }
        
    }
    
}
