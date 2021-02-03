package com.ejerciciosprogramacion;

public class ConversorTemperaturas {
    public static final float TEMPERATURA_MINIMA =80F; // creo una constante estática de clase con el valor mínimo

    public ConversorTemperaturas() {
    }
    public float centigradosAFarenheit(float temperaturaCentigrados) throws TemperaturaErrada{
        if (temperaturaCentigrados<TEMPERATURA_MINIMA)
            throw new TemperaturaErrada("Introduzca una temperatura superior a 80º");
        else {
            return (temperaturaCentigrados * 1.8F) + 32.4F;
        }
    }
    public void centigradosAReamur (float celsius){
        try {
            float temperaturaReamur=0.8F*celsius;
            if (celsius<TEMPERATURA_MINIMA) {
                throw new TemperaturaErrada();
            }
            System.out.println("temperatura en celsius= " + temperaturaReamur);
        }catch (TemperaturaErrada es){
            System.out.println(es.getMessage());
        }
    }
         }


