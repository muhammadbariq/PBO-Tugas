/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : Muhammad Bariq A
 * KELAS             : PBO3
 * NIM               : 10117107
 * Deskripsi Program : Program ini menampilkan ejaan nama
 */
public class PBO310117107Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nama;
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = scanner.next();
        
        int panjang = nama.length();
        char[] arrChar = new char[panjang];

        for (int no=0; no <= panjang-1; no++){
        arrChar[no] = nama.charAt(no);
        System.out.println("Huruf ke- " + (no+1) +" : " + arrChar[no]);
    }
    }
}
