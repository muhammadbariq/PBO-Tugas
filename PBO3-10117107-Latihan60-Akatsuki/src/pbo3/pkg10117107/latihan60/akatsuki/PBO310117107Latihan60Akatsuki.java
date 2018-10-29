/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan60.akatsuki;

/**
 *
 * @author
 * * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menampilkan data anggota
 *                        akatsuki
 */
public class PBO310117107Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pakaian = "Jubah Hitam Bermotif Awan Merah";
        String tujuan = "Mengumpulkan Semua Jinchuriki";
        
        Anggota pain = new Anggota("Pain", "Amegakure", "Besi Tajam", "Rinnegan", "Mengorbankan diri untuk menghidupkan warga konoha", pakaian, tujuan);
        Anggota konan = new Anggota("Konan", "Amegakure", "Shuriken Kertas", "Kertas", "Dibunuh oleh Obito", pakaian, tujuan);
        Anggota obito = new Anggota("Uchiha Obito", "Konohagakure", "Kunai", "Mangekyo Sharingan", "Mengorbankan diri untuk melindungi naruto dan sasuke", pakaian, tujuan);
        Anggota kakuzu= new Anggota("Kakuzu", "Takigakure", "Boneka Elemen", "Mengendalikan Ke-5 elemen", "Dibunuh oleh Naruto dan Kakashi", pakaian, tujuan);
        Anggota sasori = new Anggota("Sasori", "Sunagakure", "Boneka", "Ahli Boneka", "Dibunuh oleh nenek Chiyo dan Sakura", pakaian, tujuan);
        Anggota itachi = new Anggota("Uchiha Itachi", "Konohagakure", "Kunai", "Mangekyo Sharingan", "Dibunuh oleh adiknya sendiri, Sasuke Uchiha", pakaian, tujuan);
        Anggota kisame = new Anggota("Hoshigaki Kisame", "Kirigakure", "Samehada", "Anggota 7 pedang desa kabut", "Bunuh diri", pakaian, tujuan);
        Anggota orochimaru = new Anggota("Orochimaru", "Konohagakure", "Ular", "Anggota 3 sanin legendaris", "Masih hidup", pakaian, tujuan);
        Anggota hidan = new Anggota("Hidan", "Yugakure", "Sabit dengan 3 bilah", "Abadi", "Belum mati hanya sekarat", pakaian, tujuan);
        Anggota deidara = new Anggota("Deidara", "Iwagakure", "Peledak", "Ahli Ledakan", "Dibunuh oleh Sasuke", pakaian, tujuan);
        Anggota zetsu = new Anggota("Zetsu", "-", "-", "Ahli mata-mata", "Mati saat perang besar", pakaian, tujuan);
        
        System.out.println("TOP SECRET : Akatsuki");
        System.out.println("=====================");
        System.out.println();
        System.out.println("Pakaian : " + pain.getPakaian());
        System.out.println("Tujuan : " + pain.getTujuan());
        System.out.println();
        
        pain.displayMember();
        konan.displayMember();
        obito.displayMember();
        kakuzu.displayMember();
        sasori.displayMember();
        itachi.displayMember();
        kisame.displayMember();
        orochimaru.displayMember();
        hidan.displayMember();
        deidara.displayMember();
        zetsu.displayMember();
    }
}
    
