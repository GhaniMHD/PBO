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
public class Inu extends Animals{
    public Inu (String nama){
        super(nama); 
    }
    
    @Override
    public void bersuara(){
        System.out.println(nama+"berkata Bau Bau");
    }
    
    public void tampilkanNama(){
            System.out.println("Ini adalah"+nama); 
    }
}   
    