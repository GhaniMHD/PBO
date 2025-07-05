    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package tugas2;

    /**
     *
     * @author Windows
     */
    import java.util.Scanner;
    public class MahasiswaMain {

        public static void main(String[] args) {
        String mahasiswa;
        String nim;
        int tugas,kuis,uas,uts;

        Scanner in=new Scanner(System.in);

        System.out.println("Masukkan Nama Mahasiswa: ");
        mahasiswa = in.nextLine();
        System.out.println("Masukkan NIM Mahasiswa: ");
        nim = in.nextLine();
        System.out.println("Masukkan Nilai Tugas Mahasiswa: ");
        tugas = in.nextInt();
        System.out.println("Masukkan Nilai Kuis Mahasiswa: ");
        kuis = in.nextInt();
        System.out.println("Masukkan Nilai UTS Mahasiswa: ");
        uts = in.nextInt();
        System.out.println("Masukkan Nilai UAS   Mahasiswa: ");
        uas = in.nextInt();

        //menampilkan data yang diminta
        DataMahasiswa mhs1 = new DataMahasiswa(nim,mahasiswa,tugas,uts,uas,kuis);
        System.out.println("--Data Mahasiswa 1--");
        mhs1.Data();

        //menampilkan nilai akhir mahasiswa
        mhs1.NilaiAkhir();

        //menampilkan konversi indeks nilai mahasiswa
        mhs1.KonverNilai();

        //menampilkan hasil kelulusan mahasiswa
        mhs1.kelulusan();
        }
    }