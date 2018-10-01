/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan29.warnakepribadian;

import java.util.Scanner;
import static pbo3.pkg10117107.latihan29.warnakepribadian.warna.BLACK;
import static pbo3.pkg10117107.latihan29.warnakepribadian.warna.BLUE;
import static pbo3.pkg10117107.latihan29.warnakepribadian.warna.BLUE2;
import static pbo3.pkg10117107.latihan29.warnakepribadian.warna.BLUE_BACKGROUND;
import static pbo3.pkg10117107.latihan29.warnakepribadian.warna.GREEN;
import static pbo3.pkg10117107.latihan29.warnakepribadian.warna.GREEN_BACKGROUND;
import static pbo3.pkg10117107.latihan29.warnakepribadian.warna.PURPLE;
import static pbo3.pkg10117107.latihan29.warnakepribadian.warna.PURPLE_BACKGROUND;
import static pbo3.pkg10117107.latihan29.warnakepribadian.warna.RED;
import static pbo3.pkg10117107.latihan29.warnakepribadian.warna.RED_BACKGROUND;
import static pbo3.pkg10117107.latihan29.warnakepribadian.warna.RESET;
import static pbo3.pkg10117107.latihan29.warnakepribadian.warna.WHITE;
import static pbo3.pkg10117107.latihan29.warnakepribadian.warna.YELLOW;
import static pbo3.pkg10117107.latihan29.warnakepribadian.warna.YELLOW_BACKGROUND;

/**
 *
 * @author
 *  NAMA              : Muhammad Bariq A
 * KELAS             : PBO3
 * NIM               : 10117107
 * Deskripsi Program : Program ini menampilkan warna kepribadian
 */
public class PBO310117107Latihan29WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String warnaMu;
        String namaMu;
        Scanner scanner = new Scanner(System.in);
        System.out.println(BLACK + "PILIH WARNA FAVORITMU : ");
        System.out.println(RED+ "YUK " + GREEN + ("CEK ") + YELLOW 
                + ("KEPRIBADIANMU ") + BLUE2 + ("DARI ") + PURPLE + 
                ("WARNA ") + BLUE + ("FAVORITMU\n")+RESET);
        
        System.out.println(RED_BACKGROUND + WHITE + "\tMERAH\t\t");
        System.out.println(GREEN_BACKGROUND + WHITE + "\tHIJAU\t\t");
        System.out.println(YELLOW_BACKGROUND + WHITE + "\tKUNING\t\t");
        System.out.println(BLUE_BACKGROUND + WHITE + "\tBIRU\t\t");
        System.out.println(PURPLE_BACKGROUND + WHITE + "\tUNGU\t\t\n" + RESET);
        
        System.out.print(BLACK + "PILIH WARNA FAVORITMU : ");
        warnaMu = scanner.next();
        System.out.print(BLACK + "NAMA KAMU : ");
        namaMu = scanner.next();
        
         System.out.println("===HASIL TEST KEPRIBADIAN "+namaMu+("==="));
         System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + namaMu.toUpperCase()+"====");
        warna.hasilWarna(warnaMu);
    }
    
}
