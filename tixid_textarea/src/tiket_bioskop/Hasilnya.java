/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiket_bioskop;

public class Hasilnya {
    
    String jenistiket, jam, jamtayang;
    double nilai1, nilai2, hasil, biaya;

    public void setJam(String val) {
        jam = val;
    }
    
    public String getJam() {
        return jam;
    }

    public String getJamtayang() {
        return jamtayang;
    }

    public void setJamtayang(String jamtayang) {
        this.jamtayang = jamtayang;
    }
    
    public void setSeleksiJam(){
        if (jam.equalsIgnoreCase("11:00")){
            jamtayang = "11:00";
        }
        else if (jam.equalsIgnoreCase("11:00")){
            jamtayang = "11:00";
        }
        else if (jam.equalsIgnoreCase("11:00")){
            jamtayang = "11:00";
        }
        else if (jam.equalsIgnoreCase("11:00")){
            jamtayang = "11:00";
        }
        else if (jam.equalsIgnoreCase("11:00")){
            jamtayang = "11:00";
        }
        else if (jam.equalsIgnoreCase("11:00")){
            jamtayang = "11:00";
        }
        else if(jam.equalsIgnoreCase("-PILIH-")){
             jamtayang = "Tolong Pilih Jam Yang Benar";
        }
    }
    
    //Tiket
    public void setJenisTiket(String val){
        jenistiket = val;
    }
    
    public String getJenisTiket(){
        return jenistiket;
    }

    public double getBiaya(){
        return biaya;
    }

    public void setSeleksiJenisTiket(){
        if (jenistiket.equalsIgnoreCase("Reguler")){
            biaya=50000;
        }else if(jenistiket.equalsIgnoreCase("Ultra")){
            biaya=60000;
        }else if(jenistiket.equalsIgnoreCase("XdUltra")){
            biaya=70000;
        }else if(jenistiket.equalsIgnoreCase("Gold")){
            biaya=100000;
        }else{
            biaya=0;
        }
    }
    
    //Nilai
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




