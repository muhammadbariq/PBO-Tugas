/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk mencetak nama
 */
public class PBO310117107Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Age age = new Age(2018);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Tahun lahir anda : ");
        age.setYearBirth(scanner.nextInt());
        
        System.out.println("======Hasil Perhiyungan Umur======");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth(0));
        System.out.println("Hari ini Tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "
                + age.hitungUmur()+ " tahun");
        System.out.println("Tandanya Kamu : "+ age.tandanyaKamu(age.hitungUmur()));
    }
    
}
