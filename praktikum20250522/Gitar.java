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
public class Gitar extends AlatMusik{
    private int jumlahSenar;
    
    public Gitar(String nama, String jenis, int jumlahSenar){
        super(nama, jenis);
        this.jumlahSenar=jumlahSenar;
    }
    
    @Override
    public void mainkan(){
        System.out.println(nama+" dipetik dengan "+jumlahSenar+" senar.");
    }
    
    @Override
    public void stem(){
        System.out.println("Menyetem gitar "+nama+" dilakukan manual.");
    }
    
    public int getJumlahSenar(){
        return jumlahSenar;
    }
    
    
}
