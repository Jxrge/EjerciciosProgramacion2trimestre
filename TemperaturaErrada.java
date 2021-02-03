package com.ejerciciosprogramacion;

public class TemperaturaErrada {
    public class TemperaturaErradaException extends Exception{
        public TemperaturaErradaException(){
            super("La temperatura no puede ser inferior a 80º ");
        }
        public TemperaturaErradaException(String mensaje){
            super(mensaje);
        }
    }
