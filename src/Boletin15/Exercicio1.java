package com.ejerciciosprogramacion;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] arrayNumeros = new int[6];

        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i] = generarNumero(50);
            System.out.printf("Indice %d -> %d \n", i, arrayNumeros[i]);
        }
    }

    static int generarNumero(int max) {
        return (int)Math.floor(Math.random() * max);
    }
}
