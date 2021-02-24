package com.ejerciciosprogramacion;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] notas = new int[30];
        int[] estadisticas = {
                0,				// Suspensos
                0,				// Aprobados
                0,				// Media
                0				// Nota máxima
        };

        for (int i = 0; i < notas.length; i++) {
            int nota = Exercicio1.generarNumero(10);

            if (nota > 5) {
                // Aprobado
                estadisticas[1]++;
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

        System.out.printf(
                     "Aprobados:      %d \n"	+
                        "Suspensos:      %d \n"	+
                        "Nota media:     %d \n"	+
                        "Nota máxima:    %d \n",
                estadisticas[1], estadisticas[0], estadisticas[2], estadisticas[3]
        );
    }
}
