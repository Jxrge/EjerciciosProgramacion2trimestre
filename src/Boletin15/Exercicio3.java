package com.ejerciciosprogramacion;

import java.util.Scanner;

public class Exercicio3 {
    static String[] alumnos = {
            "Juan", "Gustavo", "Anselmo", "Samir", "Marc", "Alonso", "Jose", "Victor", "Adrian", "Eusebio", "Alex", "Xabier", "Carlos", "Manuel", "Antonio",
            "Raquel", "Maria", "Erica", "Anna", "Elisabeth", "Anais", "Ester", "Gemma", "Juana", "Jennifer", "Lia", "Fatima", "Ana", "Juliana", "Daniela"
    };
    static int[] notas = new int[30];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] estadisticas = {
                0,				// Suspensos
                0,				// Aprobados
                0,				// Media
                0				// Nota máxima
        };

        System.out.println("-- APROBADOS --");
        for (int i = 0; i < notas.length; i++) {
            int nota = Exercicio1.generarNumero(10);

            if (nota > 5) {
                // Aprobado
                estadisticas[1]++;
                System.out.printf("%s aprobado cun %d \n", alumnos[i], nota);
            } else {
                // Suspenso
                estadisticas[0]++;
            }
            estadisticas[2] += nota;

            if (i != 0) {
                if (nota > estadisticas[3]) {
                    estadisticas[3] = nota;
                }
            } else {
                estadisticas[3] = nota;
            }

            notas[i] = nota;
        }

        estadisticas[2] = estadisticas[2] / notas.length;

        System.out.println("\n-- ESTADISTICAS --");
        System.out.printf(
                "Aprobados:      %d \n"	+
                        "Suspensos:      %d \n"	+
                        "Nota media:     %d \n"	+
                        "Nota máxima:    %d \n\n", +
                estadisticas[1], estadisticas[0], estadisticas[2], estadisticas[3]
        );

        ordenarNotas();

        System.out.println("\n-- NOTAS ORDENADAS --");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%s tiene un %d \n", alumnos[i], notas[i]);
        }

        System.out.println("\n-- BUSCAR --");
        System.out.println("Introduce o nome ao buscar:");
        String nombreBuscar = scanner.nextLine();

        int indiceAlumno = buscarAlumno(nombreBuscar);
        if (indiceAlumno >= 0) {
            System.out.printf("%s tiene un %d", alumnos[indiceAlumno], notas[indiceAlumno]);
        }
    }
    static void ordenarNotas() {
        for (int i = 0; i < notas.length; i++) {
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    int auxiliarNota = notas[i];
                    String auxiliarNombre = alumnos[i];

                    notas[i] = notas[j];
                    alumnos[i] = alumnos[j];

                    notas[j] = auxiliarNota;
                    alumnos[j] = auxiliarNombre;
                }
            }
        }
    }
    static int buscarAlumno(String nombre) {
        int resultado = -1;

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].equals(nombre)) {
                resultado = i;
                break;
            }
        }

        return resultado;
    }
}
