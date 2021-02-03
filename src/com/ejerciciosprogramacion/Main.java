package com.ejerciciosprogramacion;

public class Main {

    public static void main(String[] args) {
        ConversorTemperaturas temperatura1 = new ConversorTemperaturas();
        ConversorTemperaturas temperatura2 = new ConversorTemperaturas();
        try {
            System.out.println("Estos grados están en Farenheit "+temperatura1.centigradosAFarenheit(78));
        }catch (TemperaturaErrada error){
            System.out.println(error.getMessage());
        }
        temperatura2.centigradosAReamur(46F);
    }

}