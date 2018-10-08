/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117107.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author
 * Nama                 : Muhammad Bariq A
 * Kelas                : PBO3
 * NIM                  : 10117107
 * Deskripsi Program    : Program ini berisi program untuk menampilkan User
 *                        Login
 */
public class PBO310117107Latihan33UserLogin {

    private static String usName;
    private static String passWord;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Username = ");
        usName = scanner.next();
        
        System.out.println("Masukkan Password = ");
        passWord = scanner.next();
        
        User cek = new User();
        cek.pengecekkanLogin(usName, passWord);
    }
    
}
