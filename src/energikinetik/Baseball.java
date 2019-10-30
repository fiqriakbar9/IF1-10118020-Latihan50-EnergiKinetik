/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energikinetik;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menghitung energi kinetik
 * dari suatu massa dan kecepatan bola jika dimulai dari keadaan diam
 * 
 */
public class Baseball {
    private double massa;
    private double kecepatan;
    private double ek1;
    private double ek2;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetik1(double m, double k) {
        ek1 = 0.5 * m * (k * k);
        return ek1;
    }
    
    public double hitungEnergiKinetik2(double m){
        this.ek2 = 0.5 * m * 0;
        return ek2;
    }
    
    public double usaha(){
        return ek1 - ek2;
    }
    
        
}
