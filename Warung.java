package com.company;

public class Warung {
    String namaWarung,namaProduk;
    double hargaMakanan;

    Warung(String namaWarung, String namaProduk, double hargaMakanan){
        this.namaWarung   = namaWarung;
        this.namaProduk   = namaProduk;
        this.hargaMakanan = hargaMakanan;
    }

    public String getNamaWarung(){
        return namaWarung;
    }
    public void setNamaWarung(String namaWarung){
        this.namaWarung = namaWarung;
    }
    public String getNamaProduk(){
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    public double getHargaMakanan(){
        return hargaMakanan;
    }
    public void setHargaMakanan(double hargaMakanan){
        this.hargaMakanan = hargaMakanan;
    }
}
