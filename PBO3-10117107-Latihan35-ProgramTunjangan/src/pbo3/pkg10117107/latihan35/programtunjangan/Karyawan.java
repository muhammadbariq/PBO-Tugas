/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan35.programtunjangan;

/**
 *
 * @author
 */
public class Karyawan {
   public String status;
   public double gajiPokok;
   public double tunjangan;
   
   public double hitungTunjangan(String parStatus, double parGajiPokok){
       return tunjangan = (parStatus.equals("Menikah")?0.35*parGajiPokok:0);}
   
   public double hitungTotalGaji(double parGajiPokok, double parTunjangan){
       return tunjangan = parGajiPokok+parTunjangan;}
   
   public void hasilHitungan(String parStatus, double parGajiPokok){
       System.out.println("\n=========Hasil Perhitungan Gaji Anda=========");
       System.out.println("Gaji Pokok \t: Rp " + gajiPokok);
       System.out.println("Tunjangan \t: Rp " + hitungTunjangan(parStatus, parGajiPokok));
       System.out.println("Total Gaji \t: Rp " + hitungTotalGaji(parGajiPokok, tunjangan));
       System.out.println("(Developed by: Muhammad Bariq A)");}
}
