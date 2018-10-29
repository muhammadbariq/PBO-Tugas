/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan60.akatsuki;

/**
 *
 * @author
 */
public class Anggota extends Akatsuki{
    private String nama;
    private String negara;
    private String senjata;
    private String kemampuan;
    private String kematian;

    public Anggota(String nama, String negara, String senjata, String kemampuan, String kematian, String pakaian, String tujuan) {
        super(pakaian, tujuan);
        this.nama = nama;
        this.negara = negara;
        this.senjata = senjata;
        this.kemampuan = kemampuan;
        this.kematian = kematian;
    }

    public String getNama() {
        return nama;
    }

    public String getNegara() {
        return negara;
    }

    public String getSenjata() {
        return senjata;
    }

    public String getKemampuan() {
        return kemampuan;
    }

    public String getKematian() {
        return kematian;
    }
    
    
    
    public void displayMember() {
        System.out.println("-------------------");
        System.out.println("Nama : " + nama);
        System.out.println("-------------------");
        System.out.println("Negara : " + negara);
        System.out.println("Senjata : " + senjata);
        System.out.println("Kemampuan : " + kemampuan);
        System.out.println("Kematian : " + kematian);
        System.out.println();
    }
    
}
