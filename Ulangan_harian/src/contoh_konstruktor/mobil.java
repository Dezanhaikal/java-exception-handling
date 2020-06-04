/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh_konstruktor;

/**
 *
 * @author HP
 */
class Mobil{
    private String warna;
    private int tahunproduksi;
public Mobil(String warna,int tahunprediksi){
    this.warna = warna;
    this.tahunproduksi = tahunproduksi;
}
public void info(){
    System.out.println("Warna : "+this.warna);
    System.out.println("Tahun : "+this.tahunproduksi);
 }
}

public class mobil {
    public static void main(String [] args){
    Mobil mobilku = new Mobil ("Merah ", 2003);
    mobilku.info();
    }
    
    
}
