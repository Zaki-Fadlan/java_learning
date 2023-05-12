package org.example;

public class Conditionals {
    int umur;
    String cuaca;

    public Conditionals(int umur, String cuaca) {
        String hasil = (umur < 20) ? "Hey bocil" : "Hey Tua Bangka";
        if (cuaca == "Cerah") {
            System.out.println(hasil + " Cuacanya" + cuaca);
        } else {
            System.out.println(hasil + " Cuacanya " + cuaca);
        }
    }


}
