/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan34;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Kalkulator c = new Kalkulator();
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        c.value1 = sc.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        c.value2 = sc.nextDouble();
        System.out.println("\nHasil Pertambahan : "+c.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+c.kurangBilangan());
        System.out.println("Hasil Perkalian : "+c.kaliBilangan());
        System.out.println("Hasil Pembagian : "+c.bagiBilangan());
        System.out.println("Hasil Sisa : "+c.sisaBilangan());
    }
    
}
