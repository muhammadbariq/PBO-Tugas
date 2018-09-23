/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan3.muhammadbariqa;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk memasukkan nilai
 *                        dari keyboard
 */
public class PBO310117107Latihan3MuhammadBariqA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan Nama Anda: ");
        Scanner scanner = new  Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama Anda Adalah " + nama);
    }
    
}
