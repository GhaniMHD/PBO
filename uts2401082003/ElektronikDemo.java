/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2401082003;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ElektronikDemo {
    
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        
        int pilihan;

        do {
            System.out.println("Menu Elektronik");
            System.out.println("1. Input dan Tampilkan Data Smartphone");
            System.out.println("2. Input dan Tampilkan Data SmartWatch");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = in.nextInt();
            in.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nData Smartphone");
                    System.out.print("Masukkan Merek: ");
                    String merek = in.nextLine();

                    System.out.print("Masukkan Tahun Produksi: ");
                    int tahunProduksi = in.nextInt();

                    System.out.print("Masukkan Masa Garansi: ");
                    int garansi = in.nextInt();

                    System.out.print("Masukkan Kapasitas Baterai: ");
                    int kapasitasBaterai = in.nextInt();

                    System.out.print("Masukkan Jumlah Kamera: ");
                    int jumlahKamera = in.nextInt();
                    in.nextLine();

                    Smartphone smartphone = new Smartphone(kapasitasBaterai, jumlahKamera, merek, tahunProduksi, garansi);

                    System.out.println("\nData Smartphone");
                    System.out.println("Merek : " + smartphone.getMerek());
                    System.out.println("Tahun Produksi : " + smartphone.getTahunProduksi());
                    System.out.println("Garansi : " + smartphone.getGaransi() + " tahun");
                    System.out.println("Kapasitas Baterai : " + smartphone.getKapasitasBaterai());
                    System.out.println("Jumlah Kamera : " + smartphone.getJumlahKamera());
                    System.out.println();
                    break;
                    
                case 2:
                    System.out.println("\nInput Data SmartWatch");
                    System.out.print("Masukkan Merek : ");
                    merek = in.nextLine();

                    System.out.print("Masukkan Tahun Produksi : ");
                    tahunProduksi = in.nextInt();

                    System.out.print("Masukkan Masa Garansi : ");
                    garansi = in.nextInt();

                    System.out.print("Masukkan Kapasitas Baterai : ");
                    kapasitasBaterai = in.nextInt();

                    System.out.print("Masukkan Jumlah Kamera: ");
                    jumlahKamera = in.nextInt();

                    System.out.print("Masukkan Ukuran Layar : ");
                    int ukuranLayar = in.nextInt();

                    System.out.print("Apakah tahan air? (true/false): ");
                    boolean tahanAir = in.nextBoolean();
                    in.nextLine();

                    Smartwatch smartwatch = new Smartwatch(ukuranLayar, tahanAir, kapasitasBaterai, jumlahKamera, merek, tahunProduksi, garansi);

                    System.out.println("\nData SmartWatch : ");
                    System.out.println("Merek : " + smartwatch.getMerek());
                    System.out.println("Tahun Produksi : " + smartwatch.getTahunProduksi());
                    System.out.println("Garansi : " + smartwatch.getGaransi() + " tahun");
                    System.out.println("Kapasitas Baterai : " + smartwatch.getKapasitasBaterai() + " mAh");
                    System.out.println("Jumlah Kamera : " + smartwatch.getJumlahKamera());
                    System.out.println("Ukuran Layar : " + smartwatch.getUkuranLayar() + " inch");
                    System.out.println("Tahan Air : " + (smartwatch.isTahanAir() ? "Yes" : "No"));
                    System.out.println();
                    break;

                case 3:
                    System.out.println("exit.");
                    break;

                default:
                    System.out.println("Error! Choose another option\n");
            }
        } while (pilihan != 5);

        in.close();
    }
}
   
