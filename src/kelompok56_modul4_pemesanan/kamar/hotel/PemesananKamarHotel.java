/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok56_modul4_pemesanan.kamar.hotel;

import java.util.Scanner;

/**
 *
 * 
 */
public class PemesananKamarHotel {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        System.out.println("Silahkan pilih kamar yang anda inginkan");
        System.out.println("1. Standard : Rp850.000");
        System.out.println("2. Deluxe : Rp1.250.000");
        System.out.println("3. President Suite : Rp2.500.000");
        System.out.print("Pilihan : ");
        int pilihan = type.nextInt();
        switch(pilihan){
            case 1:
                Standard tipeStandar = new Standard();
                break;
            case 2:
                Deluxe tipeDeluxe = new Deluxe();
                break;
            case 3:
                PresidenSuite tipePresiden = new PresidenSuite();
                break;
        }
        
    }
}