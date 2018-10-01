/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author
 *  NAMA              : Muhammad Bariq A
 * KELAS             : PBO3
 * NIM               : 10117107
 * Deskripsi Program : Program ini menampilkan ganti kata
 */
public class PBO310117107Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         String kalimat, replace, kalimat1, ganti;
        
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("=======Program mengganti kata=======");
        System.out.print("Masukkan Kalimat :");
        kalimat = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        ganti = scanner.nextLine();
        System.out.print("Menjadi : ");
        replace = scanner.nextLine();
        
        kalimat1 = kalimat.replaceAll(ganti, replace);
        
        System.out.println("==========Hasil Foematting==========");
        System.out.println("Kalimat awal : "+kalimat);
        System.out.println("Kalimat baru : "+kalimat1);
    }
    
}
