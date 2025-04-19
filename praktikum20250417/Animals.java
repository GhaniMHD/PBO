/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum20250417;


public class Animals {
        protected String nama;
        
        public Animals(String nama){
                this.nama=nama;
        }
        
        public void bersuara(){
            System.out.println("Hewan bersuara....");
    }
        public void tampilkanNama(){
            System.out.println("Hewan ini adalah...");
        }
    
}
