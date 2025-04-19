/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum20250417;


import java.util.Scanner;

public class PesawatMain3 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah;
        int i;
        
    System.out.print("Masukkan banyak pesawat = ");
    jumlah=in.nextInt();
    in.nextLine();
    
    Pesawat[] daftarPesawat=new Pesawat [jumlah];
    
    for(i=0;i<jumlah;i++){
        System.out.println("Input Data Pesawat ke "+(i+1));
        System.out.print("Nama pesawat = ");
        String nama=in.nextLine();
        System.out.print("Tahun Produksi = ");
        int tahunProduksi=in.nextInt();
        System.out.print("menggunakan mesin? (true/false) = ");
        boolean mesin=in.nextBoolean();
        System.out.print("Jumlah maksimum penumpang = ");
        int muatan=in.nextInt();
        in.nextLine();
        
        daftarPesawat[i]=new Pesawat(nama,tahunProduksi,mesin,muatan);
    }
    
   int pilihan;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Tampilkan Daftar Pesawat");
            System.out.println("2. Cari Pesawat dengan Muatan Terbesar");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1-3): ");
            pilihan = in.nextInt();
            in.nextLine();   

            switch (pilihan) {
                case 1:
                    System.out.println("\nDAFTAR PESAWAT :");
                    for (int j = 0; j < jumlah; j++) {
                        System.out.println("\nData Pesawat ke " + (j + 1) + "==");
                        daftarPesawat[j].Cetak();   
                    }
                    break;

                case 2:
                    int max = daftarPesawat[0].getMuatan();
                    String namaPesawatMax = daftarPesawat[0].getNama();   
                    for (int j = 0; j < jumlah; j++) {
                        if (daftarPesawat[j].getMuatan() > max) {
                            max = daftarPesawat[j].getMuatan();
                            namaPesawatMax = daftarPesawat[j].getNama();
                        }
                    }
                    System.out.println("\nPesawat "+ namaPesawatMax+" memiliki muatan terbesar dengan muatan sebanyak "+max);
             
                    break;

                case 3:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 3);

        in.close();
    }
}