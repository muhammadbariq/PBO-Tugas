/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menampilkan program 
 *                        tunjangan
 */
public class PBO310117107Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        Karyawan kar = new Karyawan();
        
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        kar.gajiPokok = scanner.nextDouble();
        System.out.println("Status Anda? (Menikah/Belum): ");
        kar.status = scanner.next();
        
        kar.hasilHitungan(kar.status,kar.gajiPokok);
    }
    
}
