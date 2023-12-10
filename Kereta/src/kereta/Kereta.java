/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kereta;

/**
 *
 * @author Administrator
 */
public class Kereta {
    String jurusan, kelas;
    double tarif, jp, jb, biaya, ttarif, tjbeli, tharga, ubayar;
    /**
     * @param args the command line arguments
     */
    
    //Jurusan
    public void setJurusan(String val){
        jurusan = val;
    }
    
    public String getJurusan(){
        return jurusan;
    }
    
    public double getTarif(){
        return tarif;
    }
    
    public void setSeleksiJurusan(){
        if(jurusan.equalsIgnoreCase("Pasar Senen - Tegal")){
            tarif = 30000;
        }
        else if(jurusan.equalsIgnoreCase("Tanah Abang - Madiun")){
            tarif = 40000;
        }
        else if(jurusan.equalsIgnoreCase("Gambir - Kutuarjo")){
            tarif = 50000;
        }
    }
    
    //Nilai
    public double getJp() {
        return jp;
    }

    public void setJp(double jp) {
        this.jp = jp;
    }

    public double getJb() {
        return jb;
    }

    public void setJb(double jb) {
        this.jb = jb;
    }
    
    public double setHasil(){
        return (jp * jb);
    }
    
    //Kelas
    public void setKelas(String val){
        kelas = val;
    }
    
    public String getCara(){
        return kelas;
    }
    
    public double getBiaya(){
        return biaya;
    }
    
    public void setSeleksiKelas(){
        if(kelas.equalsIgnoreCase("Ekonomi")){
        biaya=5000;
        }
        else if(kelas.equalsIgnoreCase("Executive")){
        biaya=10000;
        }
        else{
        biaya=0;
        }
    }
    
    //tarif dan jumlah beli
    public double getTtarif() {
        return ttarif;
    }

    public void setTtarif(double ttarif) {
        this.ttarif = ttarif;
    }

    public double getTjbeli() {
        return tjbeli;
    }

    public void setTjbeli(double tjbeli) {
        this.tjbeli = tjbeli;
    }

    public double getHasil() {
        return (ttarif * tjbeli);
    }
    
    //tarif dan jumlah beli
    public double getUbayar() {
        return ubayar;
    }

    public void setUbayar(double ubayar) {
        this.ubayar = ubayar;
    }

    public double getTharga() {
        return tharga;
    }

    public void setTharga(double tharga) {
        this.tharga = tharga;
    }

    public double getHasil1() {
        return (ubayar - tharga);
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
