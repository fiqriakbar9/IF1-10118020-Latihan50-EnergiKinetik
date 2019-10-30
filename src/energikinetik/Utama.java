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
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baseball baseball = new Baseball();
        baseball.setMassa(145);
        baseball.setKecepatan(25);
        
        System.out.println("Massa sebuah bola = "+baseball.getMassa()+" g");
        System.out.println("Kecepatan sebuah bola = "+baseball.getKecepatan()+" m/s");
        
        double massa = baseball.getMassa();
        double kecepatan = baseball.getKecepatan();
        
        System.out.println("a. Berapakah energi kinetiknya ? , Jawaban : "+baseball.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("b. Berapakah usaha yang dilakukan bola .? , Jawaban : "+baseball.usaha());
        System.out.println("PS : Jika dalam keadaan diam");
        
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
    }
    
}
