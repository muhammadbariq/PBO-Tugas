/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author 
 *  NAMA              : Muhammad Bariq A
 * KELAS             : PBO3
 * NIM               : 10117107
 * Deskripsi Program : Program ini menampilkan kejujuran mahasiswa dan support dari dosen
 */
public class PBO310117107Latihan30Cakep {

     
    public static final String MBRQHDA_RESET = "\u001B[0m";
    public static final String MBRQHDA_BLACK = "\u001B[30m";
    public static final String MBRQHDA_RED = "\u001B[31m";
    public static final String MBRQHDA_GREEN = "\u001B[32m";
    public static final String MBRQHDA_YELLOW = "\u001B[33m";
    public static final String MBRQHDA_BLUE = "\u001B[34m";
    public static final String MBRQHDA_PURPLE = "\u001B[35m";
    public static final String MBRQHDA_CYAN = "\u001B[36m";
    public static final String MBRQHDA_WHITE = "\u001B[37m";

    public static final String MBRQHDA_BLACK_BACKGROUND = "\u001B[40m";
    public static final String MBRQHDA_RED_BACKGROUND = "\u001B[41m";
    public static final String MBRQHDA_GREEN_BACKGROUND = "\u001B[42m";
    public static final String MBRQHDA_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String MBRQHDA_BLUE_BACKGROUND = "\u001B[44m";
    public static final String MBRQHDA_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String MBRQHDA_CYAN_BACKGROUND = "\u001B[46m";
    public static final String MBRQHDA_WHITE_BACKGROUND = "\u001B[47m";
    
    public static void main(String[] args) {
        String jawab;
        Scanner scn = new Scanner(System.in);
        
        System.out.print(MBRQHDA_RED+"Kamu "+MBRQHDA_RESET);
        System.out.print(MBRQHDA_GREEN+"ngerjain sendiri "+MBRQHDA_RESET);
        System.out.print(MBRQHDA_YELLOW+"latihan 17 sampe "+MBRQHDA_RESET);
        System.out.print(MBRQHDA_BLUE+"latihan 30 ini? \n"+MBRQHDA_RESET);
        System.out.print(MBRQHDA_BLUE+"Jawab "+MBRQHDA_RESET);
        System.out.print(MBRQHDA_RED+"(Yoi/Enggak) : "+MBRQHDA_RESET);
        jawab = scn.next();
        
        String jawaban = jawab.toUpperCase();
        if (jawaban.equals("YOI")) {
            System.out.print(MBRQHDA_RED+"\n Cakep Bener. "+MBRQHDA_RESET);
            System.out.print(MBRQHDA_PURPLE+"Good Job \n"+MBRQHDA_RESET);
        }else{
            System.out.print(MBRQHDA_RED+"\n Tetep cakep sih. "+MBRQHDA_RESET);
            System.out.print(MBRQHDA_CYAN+"\n Sing penting paham konsep nya yee. "
                    +MBRQHDA_RESET);
            System.out.print(MBRQHDA_BLACK+"\n Keep the code works dude."+MBRQHDA_RESET);  
    }
    }
}
