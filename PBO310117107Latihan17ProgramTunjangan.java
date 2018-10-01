/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA              : Muhammad Bariq A
 * KELAS             : PBO3
 * NIM               : 10117107
 * Deskripsi Program : Program ini menampilkan total gaji pokok dalam sebulan
 */
public class PBO310117107Latihan17ProgramTunjangan {

    
    public static void main(String[] args) {
        String status = "menikah"  ;
        double gajiPokok, tunjangan, gajitotal;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("----------Program Tunjangan---------");
        System.out.println("berapa gaji pokok anda perbulan?: Rp. ");
        gajiPokok = scanner.nextDouble();
        System.out.println("Status Anda? (menikah/belum): Rp. ");
        status = scanner.next();
        
         if (status.equals(status)) {
        tunjangan = (int) (gajiPokok * 0.35);
        gajitotal = (int) (gajiPokok + tunjangan);              
         System.out.println("==========Hasil Perhitungan Gaji Anda==========");
         System.out.println("Gaji Pokok           : Rp " + gajiPokok);
         System.out.println("Tunjangan            : Rp " + tunjangan);
         System.out.println("Total Gaji           : Rp " + gajiPokok);
        }else if (status.equals(status)) {
        tunjangan = 0;
        gajitotal = (int) (gajiPokok + tunjangan);  
         System.out.println("==========Hasil Perhitungan Gaji Anda==========");
         System.out.println("Gaji Pokok           : Rp " + gajiPokok);
         System.out.println("Tunjangan            : Rp " + tunjangan);
         System.out.println("Total Gaji           : Rp " + gajitotal);   
        }else{
         System.out.println("Maaf status yang anda masukkan salah, " + "harap di isi antara "+status+ " atau " + "!!!!");
    }
    
}
}
