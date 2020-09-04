/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaTecnica;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author vagudelo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        registrarPasaje();
        Ejercicio2.equipajeAvion();
    }

    public static void registrarPasaje() {
        double distancia = 0;
        double dias = 0;

        distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia del recorrido"));
        dias = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número de días de estadía"));

        calcularPasaje(distancia, dias);
    }

    public static void calcularPasaje(double distancia, double dias) {
        double valorPasaje = 0;
        double descuento = 0;
        double valorFinalPasaje = 0;
        final double TARIFA = 35.00;
        final double DESCUENTO = 0.30;
        NumberFormat nf = NumberFormat.getInstance(new Locale("es", "CO"));

        if (dias > 7 && distancia > 1000) {
            valorPasaje = distancia * TARIFA;
            descuento = valorPasaje * DESCUENTO;
            valorFinalPasaje = valorPasaje - descuento;
            JOptionPane.showMessageDialog(null, "De acuerdo a que su trayecto es superior a 1000km\n"
                    + "y su estadía es superior a 7 días, la compañía le otorga\n"
                    + "un descuento del 30% en el costo de su pasaje\n"
                    + "\nTRAYECTO:    " + distancia + " KM\n"
                    + "ESTADÍA:       " + dias + " DÍAS\n"
                    + "\nVALOR PASAJE:    " + nf.format(valorPasaje) + "\n"
                    + "DESCUENTO:       " + nf.format(descuento) + "\n"
                    + "TOTAL A PAGAR:   " + nf.format(valorFinalPasaje));
        } else {
            valorPasaje = distancia * TARIFA;
            JOptionPane.showMessageDialog(null, "El valor total de su pasaje es: " + valorPasaje);
        }
    }
}
