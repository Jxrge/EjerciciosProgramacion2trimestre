
package boletin12;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Garaje obxGarj = new Garaje();
        Coche obxCoch = new Coche();

        double precio = 0;
        double dineroRecibido = 0;
        double dineroDevuelto = 0;

        String matricula = obxCoch.matricula;
        matricula = JOptionPane.showInputDialog("Escribe la matrícula");
        if (obxGarj.numeroPlazas >= 1 && obxGarj.numeroPlazas < 5)
        {
            JOptionPane.showMessageDialog(null, "Plazas Disponibles");
            obxGarj.setTiempo(Integer.parseInt(JOptionPane.showInputDialog("Cuanto tiempo piensa estacionar? (En horas)")));
            precio = obxGarj.calcularTiempo();
            JOptionPane.showMessageDialog(null, "El precio a pagar es de "+precio+"€");
            dineroRecibido = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dinero"));
            dineroDevuelto = dineroRecibido - precio;
        } else {
            JOptionPane.showMessageDialog(null, "Completo");
        }
        // FACTURA
        System.out.println("FACTURA");
        System.out.println("--------");
        System.out.println("MATRICULA: "+ matricula);
        System.out.println("TIEMPO: "+ obxGarj.getTiempo());
        System.out.println("PRECIO: "+ precio);
        System.out.println("DIÑEIRO RECIBIDO "+ dineroRecibido);
        System.out.println("DIÑEIRO DEVUELTO "+ dineroDevuelto);
        System.out.println("--------");
        System.out.println("GRACIAS POR USAR O NOSO APARCADOIRO");
    }
}
