/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan41.massajenis;

import java.util.Scanner;



/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menampilkan hasil massa
 *                        jenis kubus
 */
public class PBO310117107Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kubus kbs = new Kubus();
        
        System.out.println("========Massa Jenis Kubus========");
        System.out.print("Sisi : ");
        kbs.setSisi(scanner.nextInt());
        System.out.print("Massa : ");
        kbs.setMassa(scanner.nextInt());
        
        System.out.println("\n"+"========Hasil Perhitungan========");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : " + kbs.hitungMassaJenis(kbs.getMassa(), 
                        kbs.hitungVolume(kbs.getSisi())));
    }
 }
    

