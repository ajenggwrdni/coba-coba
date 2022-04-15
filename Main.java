package com.company;

public class Main {
    public static void main(String[] args) {
        DataWarung.war = DataWarung.tambahWarung(new Warung("Bakso Pak Sahid", "Bakso", 8000));
        DataWarung.war = DataWarung.tambahWarung(new Warung("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataWarung.war = DataWarung.tambahWarung(new Warung("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataWarung.war = DataWarung.tambahWarung(new Warung(DataWarung.in.nextLine(),DataWarung.in.nextLine(),DataWarung.in.nextDouble()));
        DataWarung.tampilData();
    }
}