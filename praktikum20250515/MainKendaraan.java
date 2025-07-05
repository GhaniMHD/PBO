package praktikum20250515;

import java.util.Scanner;

public class MainKendaraan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Pilih jenis kendaraan:");
        System.out.println("1 = Mobil");
        System.out.println("2 = Sepeda");
        System.out.println("3 = Truk");
        System.out.println("4 = Taksi");
        System.out.println("5 = Sepeda Listrik");
        System.out.print("Masukkan pilihan: ");
        int pilihan = in.nextInt();
        in.nextLine();

        Kendaraan kendaraan = null;

        switch (pilihan) {
            case 1:
                System.out.print("Jumlah Roda: ");
                int jmlRoda = in.nextInt();
                in.nextLine();
                System.out.print("Warna: ");
                String warna = in.nextLine();
                System.out.print("Bahan Bakar: ");
                String bahanBakar = in.nextLine();
                System.out.print("Kapasitas Mesin: ");
                int kapasitasMesin = in.nextInt();
                in.nextLine();

                kendaraan = new Mobil(bahanBakar, kapasitasMesin, jmlRoda, warna);
                break;

            case 2:
                System.out.print("Jumlah Sadel: ");
                String jmlSadel = in.nextLine();
                System.out.print("Jumlah Gir: ");
                int jmlGir = in.nextInt();
                in.nextLine();
                System.out.print("Jumlah Roda: ");
                jmlRoda = in.nextInt();
                in.nextLine();
                System.out.print("Warna: ");
                warna = in.nextLine();

                kendaraan = new Sepeda(jmlSadel, jmlGir, jmlRoda, warna);
                break;

            case 3:
                System.out.print("Muatan Maksimum: ");
                int muatanMaks = in.nextInt();
                in.nextLine();
                System.out.print("Bahan Bakar: ");
                bahanBakar = in.nextLine();
                System.out.print("Kapasitas Mesin: ");
                kapasitasMesin = in.nextInt();
                in.nextLine();
                System.out.print("Jumlah Roda: ");
                jmlRoda = in.nextInt();
                in.nextLine();
                System.out.print("Warna: ");
                warna = in.nextLine();

                kendaraan = new Truk(muatanMaks, bahanBakar, kapasitasMesin, jmlRoda, warna);
                break;

            case 4:
                System.out.print("Tarif Awal: ");
                int tarifAwal = in.nextInt();
                in.nextLine();
                System.out.print("Tarif Per Km: ");
                int tarifPerKm = in.nextInt();
                in.nextLine();
                System.out.print("Bahan Bakar: ");
                bahanBakar = in.nextLine();
                System.out.print("Kapasitas Mesin: ");
                kapasitasMesin = in.nextInt();
                in.nextLine();
                System.out.print("Jumlah Roda: ");
                jmlRoda = in.nextInt();
                in.nextLine();
                System.out.print("Warna: ");
                warna = in.nextLine();

                kendaraan = new Taksi(tarifAwal, tarifPerKm, bahanBakar, kapasitasMesin, jmlRoda, warna);
                break;

            case 5:
                System.out.print("Kecepatan Maksimum: ");
                int kecepatanMaks = in.nextInt();
                in.nextLine();
                System.out.print("Jarak Tempuh: ");
                int jarakTempuh = in.nextInt();
                in.nextLine();
                System.out.print("Jumlah Sadel: ");
                jmlSadel = in.nextLine();
                System.out.print("Jumlah Gir: ");
                jmlGir = in.nextInt();
                in.nextLine();
                System.out.print("Jumlah Roda: ");
                jmlRoda = in.nextInt();
                in.nextLine();
                System.out.print("Warna: ");
                warna = in.nextLine();

                kendaraan = new SepedaListrik(kecepatanMaks, jarakTempuh, jmlSadel, jmlGir, jmlRoda, warna);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                in.close();
                return;
        }

        System.out.println("\nData kendaraan yang dimasukkan:");
        kendaraan.display();

        in.close();
    }
}