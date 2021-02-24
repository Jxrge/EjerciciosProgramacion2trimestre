package com.ejerciciosprogramacion;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {
    final static HashMap<Integer, Character> kvpChars = new HashMap<Integer, Character>() {
        {
            put(3, 'A');
            put(11, 'B');
            put(20, 'C');
            put(9, 'D');
            put(22, 'E');
            put(7, 'F');
            put(4, 'G');
            put(18, 'H');
            put(13, 'J');
            put(21, 'K');
            put(19, 'L');
            put(5, 'M');
            put(12, 'N');
            put(8, 'P');
            put(16, 'Q');
            put(1, 'R');
            put(15, 'S');
            put(0, 'T');
            put(17, 'V');
            put(2, 'W');
            put(10, 'X');
            put(6, 'Y');
            put(14, 'Z');
        }
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce o DNI:");

        try	{
            System.out.printf("A letra correspondiente es %s", comprobarDNI(scanner.nextLine()));
        } catch	(InputMismatchException inputMismatchException) {
            System.out.println("O valor introducido non e valido");
        }
    }
    static String generarDNI() {
        String DNI = "";

        for (int i = 0; i < 8; i++) {
            DNI += Exercicio1.generarNumero(10);
        }

        DNI += kvpChars.get((int)(Integer.parseInt(DNI) % 23));

        return DNI;
    }

    static String comprobarDNI(String DNI) {
        if (DNI.length() == 8) {
            return kvpChars.get((int)(Integer.parseInt(DNI) % 23)).toString();
        } else {
            return "ERROR";
        }
    }
}