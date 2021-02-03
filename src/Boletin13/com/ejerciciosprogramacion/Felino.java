package com.ejerciciosprogramacion;

public class Felino  extends Mamifero implements IPodeNadar{

    @Override
    public void podeNadar(){
        System.out.println("Pode nadar");
    }
}
