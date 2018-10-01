/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan24.perbandingan;

import java.util.Scanner;

/**
 *
 * @author 
 *  NAMA              : Muhammad Bariq A
 * KELAS             : PBO3
 * NIM               : 10117107
 * Deskripsi Program : Program ini menampilkan nilai perbandingan
 */
public class PBO310117107Latihan24Perbandingan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int nilai1,nilai2;
        String jawab = "Ya" ;
        


        while ("Ya".equals(jawab)){
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("=====Program Perbandingan nilai======");
        System.out.print("Masukkan Nilai Pertama : ");
        nilai1 = scanner.nextInt();
        System.out.print("Masukkan nilai kedua : ");
        nilai2 = scanner.nextInt();
        if (nilai1 > nilai2){
            System.out.println("Hasil : "+nilai1+" Lebih besar dari "+nilai2);
        }else if (nilai2 > nilai1){
            System.out.println("Hasil : "+nilai2+" Lebih besar dari "+nilai1);
        }
        

        System.out.print("Ulangi Aktifitas (Ya/Tidak) : ");
        jawab = scanner.next();
    }
    }
}
