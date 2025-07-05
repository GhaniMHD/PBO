/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2401082003;



/**
 *
 * @author LENOVO
 */
public class Smartwatch extends Smartphone {
    private int ukuranLayar;
    private boolean tahanAir;  

public Smartwatch(int ukuranLayar, boolean tahanAir,int kapasitasBaterai, int jumlahKamera, String merek,int tahunProduksi,int garansi){
    super(kapasitasBaterai,jumlahKamera,merek,tahunProduksi,garansi);
    this.ukuranLayar = ukuranLayar;
    this.tahanAir = tahanAir;
}

public int getUkuranLayar(){
    return ukuranLayar;
}

public void setUkuranLayar(int ukuranLayar){
    this.ukuranLayar=ukuranLayar;
}

public boolean isTahanAir(){
    return tahanAir;
}

public void setTahanAir(boolean tahanAir){
    this.tahanAir=tahanAir;
}

}