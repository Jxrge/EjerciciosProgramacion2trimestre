package com.ejerciciosprogramacion;

public class Aves extends Animales implements  IPodeCaminar{

    @Override
    public void podeCaminar(){

        System.out.println("Pode caminar ");
    }

}