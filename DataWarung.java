package com.company;
import java.util.Scanner;
public class DataWarung {
    static Scanner in = new Scanner(System.in);
    static Warung[] war = new Warung[0];

    public static Warung[] tambahWarung(Warung warung){
        Warung temp[]=new Warung[DataWarung.war.length+1];
        for (int i = 0; i < DataWarung.war.length; i++){
            temp[i]=DataWarung.war[i];
        }
        temp[DataWarung.war.length]=warung;
        return temp;
    }

    public static void tampilData(){
        for (Warung mch1 : war){
            System.out.println("====Tampilan Data Warung UBFood====");
            System.out.println("Nama Warung     : "+mch1.getNamaWarung());
            System.out.println("Nama Produk     : "+mch1.getNamaProduk());
            System.out.println("Harga           : "+(int)mch1.getHargaMakanan());
        }
    }
    public static Warung cariWarung (String nama){
        for (int i = 0; i < DataWarung.war.length; i++){
            if (nama.equalsIgnoreCase(DataWarung.war[i].getNamaWarung())){
                return DataWarung.war[i];
            }
        }
        return null;
    }
}
