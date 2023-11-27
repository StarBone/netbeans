/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiket_bioskop;

import javax.swing.JTextField;

public class Hasilnya {

    private double nilai1;
    private double nilai2;
    private double hasil;

    public double getNilai1() {
        return nilai1;
    }

    public void setNilai1(double nilai1) {
        this.nilai1 = nilai1;
    }

    public double getNilai2() {
        return nilai2;
    }

    public void setNilai2(double nilai2) {
        this.nilai2 = nilai2;
    }

    public double getHasil() {
        return (nilai1 * nilai2);
    }
}


