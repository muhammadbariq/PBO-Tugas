/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan32.daftarfilm;

/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menampilkan daftar
 *                        film
 */
public class PBO310117107Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===Daftar Film Sedang Tayang===\n");
        
        film fl1 = new film();
        fl1.filmName = "Venom";
        fl1.filmGenre = "Action, Horror, Scifi";
        fl1.filmRating = 8.5;
        fl1.filmDuration = 120;
        fl1.nowPlaying(fl1.filmName, fl1.filmGenre, fl1.filmRating, fl1.filmDuration);
        
        film fl2 = new film();
        fl2.filmName = "Small Foot";
        fl2.filmGenre = "Animation";
        fl2.filmRating = 9.0;
        fl2.filmDuration = 96;
        fl2.nowPlaying(fl2.filmName, fl2.filmGenre, fl2.filmRating, fl2.filmDuration);
        
        film fl3 = new film();
        fl3.filmName = "Crazy Rich Asian";
        fl3.filmGenre = "Comedy";
        fl3.filmRating = 7.8;
        fl3.filmDuration = 119;
        fl3.nowPlaying(fl3.filmName, fl3.filmGenre, fl3.filmRating, fl3.filmDuration);
        
        film fl4 = new film();
        fl4.filmName = "Asih";
        fl4.filmGenre = "Horror";
        fl4.filmRating = 6.0;
        fl4.filmDuration = 100;
        fl4.nowPlaying(fl4.filmName, fl4.filmGenre, fl4.filmRating, fl4.filmDuration);
    }
    
}
