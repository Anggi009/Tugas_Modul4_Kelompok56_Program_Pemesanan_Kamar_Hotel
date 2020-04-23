package kelompok56_modul4_pemesanan.kamar.hotel;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class Hotel {
    int harga, luas, kasur, tv, keputusan, jumlahOrang, jumlahHari, umur;
    Scanner type = new Scanner(System.in);
    String[] hp = {"0", "1"};
    
    String nama;
    public Hotel(int luas, int kasur, int tv, int harga) {
        System.out.println("Fasilitas yang kamu dapati");
        System.out.println("Luas      : " + luas);
        System.out.println("Kasur     : " + kasur);
        System.out.println("Jumlah TV : " + tv);
        System.out.println("Harga     : Rp" + harga);
        this.harga = harga;
        System.out.print("Masukkan Nama Lengkap Anda : ");
        this.nama = type.nextLine();
        System.out.print("Masukkan Umur Anda Sekarang : ");
        this.umur = type.nextInt();
        System.out.print("Masukkan Jumlah Penghuni Kamar : ");
        this.jumlahOrang = type.nextInt();
        System.out.print("Masukkan Jumlah Hari Inap : ");
        this.jumlahHari = type.nextInt();               
        
        if(!hp[0].equals(hp[1])) {
            do {
                for(int i = 1; i<=2; i++) {
                    if(i == 1) {
                        System.out.print("Masukkan Nomor HP : ");
                        this.hp[(i-1)] = type.nextLine();
                    } else {
                        System.out.print("Tolong Masukkan Nomor HP Kembali : ");
                        this.hp[(i-1)] = type.nextLine();
                    }
                }
            } while (!hp[0].equals(hp[1]));
            System.out.println("Nomor HP Anda Terverifikasi Benar");
        }
        this.identitas();
    }
    
    public void identitas() {
        System.out.println("=======================================");
        System.out.println("Nama         : " + this.nama);
        System.out.println("Umur         : " + this.umur);
        System.out.println("Jumlah Orang : " + this.jumlahOrang);
        System.out.println("Jumlah Hari  : " + this.jumlahHari);
        System.out.println("=======================================");
        System.out.println("Apakah informasi mengenai anda sudah benar?");
        System.out.println("1. Yes");
        System.out.println("0. No");
        System.out.println("2. Ulangi");
        System.out.println("Pilihan : ");
        this.keputusan = type.nextInt();
        this.proses();
    }
    
    public int hargaTotal() {
        return this.harga * this.jumlahHari;
    }
    
    public void proses() {
        if(this.keputusan == 1) {
            System.out.println("Maka Biaya Totalnya adalah : Rp" + this.hargaTotal());
        } else if(this.keputusan == 0) {
            System.out.println("Anda membatalkan transaksi. Terima kasih telah berkunjung.");
        } else if(this.keputusan == 2) {
            this.identitas();
        }
    }
}

