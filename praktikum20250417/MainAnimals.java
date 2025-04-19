/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum20250417;

/**
 *
 * @author LENOVO
 */
public class MainAnimals {
    
    public static void main(String[] args){
        Animals mypet=new Animals("Makhluk Hidup");
        Neko mycat=new Neko("Raora");
        Inu mydawg=new Inu("FuwaMoco");
        
        System.out.println("\nTampilkan akses super class Hewan");
        mypet.tampilkanNama();
        mypet.bersuara();
        
        System.out.println("\nTampilkan akses sub class Kucing");
        mycat.tampilkanNama();
        mycat.bersuara();
        
        System.out.println("\nTampilkan akses sub class Anjing");
        mydawg.tampilkanNama();
        mycat.bersuara();
    }
    
}
