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
public class Neko extends Animals {
    
    public Neko(String nama){
        super(nama);
    }
    
    @Override
    public void bersuara(){
        super.bersuara(); //mengakses metode superclass
        System.out.println(nama+"berkata Nya");
    }
    
    public void tampilkanNama(){
            System.out.println("Ini adalah"+nama); 
    }
}   
