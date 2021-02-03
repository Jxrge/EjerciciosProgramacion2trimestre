package com.ejerciciosprogramacion;

public class PapaGallo extends Aves implements IPodeVolar{

    @Override
    public void podeVolar(){
        System.out.println("Pode volar");
    }
    public void amosar(){
        System.out.println("Esto é un Papagallo");
    }
}