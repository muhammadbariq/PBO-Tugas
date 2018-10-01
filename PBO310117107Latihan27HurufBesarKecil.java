/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author
 *  NAMA              : Muhammad Bariq A
 * KELAS             : PBO3
 * NIM               : 10117107
 * Deskripsi Program : Program ini menampilkan huruf besar kecil
 */
public class PBO310117107Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String kalimat;
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = scanner.nextLine();
 
        String kalimat1 = kalimat.toUpperCase();
        String kalimat2 = kalimat.toLowerCase();
        
        System.out.println("=======Hasil Formatting=========");
        System.out.println("Huruf Besar : " + kalimat1 );
        System.out.println("Huruf Kecil : " + kalimat2);
    }
    
}
