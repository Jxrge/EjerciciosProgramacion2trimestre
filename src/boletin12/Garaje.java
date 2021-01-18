
package boletin12;

public class Garaje {
    int numeroPlazas = 3;
    int tiempo;
    int tiempo3Horas = 0;
    int tiempoFinal = 0;
    double precio;

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public double calcularTiempo() {
        if (tiempo > 3){
            tiempoFinal = tiempo - 3;
            tiempo3Horas = tiempo - tiempoFinal;
            precio = ((tiempo3Horas*1.5)+(tiempoFinal*0.2));
        } else {
            precio = tiempo * 1.5;
        }
        return precio;
    }


}
