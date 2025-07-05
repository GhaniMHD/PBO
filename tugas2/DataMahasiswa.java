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
public class DataMahasiswa {
   String nim;
   String nama;
   int tugas;
   int uts;
   int uas;
   int kuis;
   double nilaiAkhir;
   
//constructor
   public DataMahasiswa(String num, String name, int as, int mid, int end, int quiz){
   this.nim=num;
   this.tugas=as;
   this.nama=name;
   this.uts=mid;
   this.uas=end;
   this.kuis=quiz;
   }
   
//method menampilkan data mahasiswa
   public void Data(){
   System.out.println("Masukkan Nama Mahasiswa: "+nama);
   System.out.println("Masukkan Nim Mahasiswa: "+nim);
   System.out.println("Masukkan Nilai Tugas Mahasiswa: "+tugas);
   System.out.println("Masukkan Nilai Kuis: "+kuis);
   System.out.println("Masukkan Nilai Uts Mahasiswa: "+uts);
   System.out.println("Masukkan Nilai Uas Mahasiswa: "+uas);
   }
   
///method untuk menentukan nilai akhir
   public double NilaiAkhir(){
   nilaiAkhir =(0.15*tugas + 0.20*kuis + 0.30*uts + 0.25*uas);
   return nilaiAkhir;
   }
   
//method untuk menentukan konversi nilai
   public void KonverNilai(){
   if(nilaiAkhir < 40)
        System.out.println("Nilai E");
   else if(nilaiAkhir < 50)
        System.out.println("Nilai D");
   else if(nilaiAkhir < 65)
        System.out.println("Nilai C");
   else if(nilaiAkhir < 80)
        System.out.println("Nilai B");
   else 
        System.out.println("Nilai A");           
}
//method menentukan lulus atau tidak lulus
   public void kelulusan(){
   if(nilaiAkhir < 65)
       System.out.println("Tidak lulus");
   else
       System.out.println("Lulus");
   }
}