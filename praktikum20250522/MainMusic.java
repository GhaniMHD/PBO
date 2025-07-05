/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum20250522;

/**
 *
 * @author LENOVO
 */
public class MainMusic {
    
    public static void main(String[]args){
        
    Gitar gitar = new Gitar("Klasik", "Petik", 6);
    Keyboard keyboard = new Keyboard("Yamaha", "Elektronik", true);
    
    System.out.println("\n Alat Musik Gitar");
    gitar.info();
    gitar.mainkan();
    gitar.stem();
    
    System.out.println();
    
    System.out.println("\n Alat Musik Keyboard");
    keyboard.nyalakan();
    keyboard.cekListrik();
    keyboard.mainkan();
    keyboard.stem();
    keyboard.matikan();
    }
}
