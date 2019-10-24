/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan61.bangunruang;

/**
 *
 * @author
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi diagramuntuk menghitung volume bangun ruang
 */
public class PBOULANG10114504Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola b = new Bola();
        Tabung t = new Tabung();
        Kerucut k = new Kerucut();

        b.setR(7);
        System.out.println("Volume Bola : " + Math.ceil(b.hitungVolume()));

        t.setH(21);
        t.setR(10);
        System.out.println("Volume Tabung : " + Math.ceil(t.hitungVolume()));

        k.setR(14);
        k.setH(9);
        System.out.println("Volume Kerucut : " + Math.ceil(k.hitungVolume()));
    }
    
}
