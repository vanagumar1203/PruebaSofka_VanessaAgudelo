/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaTecnica;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vagudelo
 */
public class Ejercicio2 {

    static ArrayList<Bulto> lista2 = new ArrayList<>();

    public static void main(String[] args) {
        equipajeAvion();
    }

    public static void equipajeAvion() {

        Scanner leer = new Scanner(System.in);

        final double CAPACIDAD = 800;
        final double DOLAR = 3500;
        boolean salir = false;
        double restante = 0, pesoPromedio = 0, mayor = 0, menor = 0, cont = 0, totalKilos = 0;
        String mensaje = "";
        
        //JOptionPane.showMessageDialog(null, "hola");

        while (totalKilos <= CAPACIDAD && salir == false) {
            boolean valido = true;
            double kilos = 0;
            double valor = 0;
            double dolar = 0;
            
            kilos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número de kilos del bulto"));
            //System.out.println("Ingrese el número de kilos del bulto");
            //kilos = leer.nextDouble();

            if (kilos >= 0 && kilos <= 25) {
                valor = 0;
            } else if (kilos >= 26 && kilos <= 300) {
                valor = kilos * 1500;
            } else if (kilos >= 301 && kilos <= 500) {
                valor = kilos * 2500;
            } else {
                JOptionPane.showMessageDialog(null, "\nLOS BULTOS NO DEBEN SER SUPERIORES A 500KG \nVALOR INGRESADO: " + kilos + "\n");
                //System.out.println("\nLOS BULTOS NO DEBEN SER SUPERIORES A 500KG \nVALOR INGRESADO: " + kilos + "\n");
                continue;
            }
            dolar = valor / DOLAR;
            if ((totalKilos + kilos) <= CAPACIDAD) {
                Bulto b1 = new Bulto(kilos, valor, dolar);
                lista2.add(b1);
                totalKilos = totalKilos + kilos;
                cont++;
                if (kilos > mayor) {
                    mayor = kilos;
                }
                if (kilos < menor || menor == 0) {
                    menor = kilos;
                }
            } else {
                JOptionPane.showMessageDialog(null, "\nNo se puede registrar esa cantidad de kilos:"
                        + "\nCAPACIDAD DEL AVIÓN:                   " + CAPACIDAD
                        + "\nKILOS EN EL AVIÓN:                     " + totalKilos
                        + "\nCAPACIDAD DISPONIBLE A INGRESAR:       " + restante
                        + "\nVALOR DEL ÚLTIMO BULTO INGRESADO:      " + kilos + "\n\n");
//                System.out.println("\nNo se puede registrar esa cantidad de kilos:"
//                        + "\nCAPACIDAD DEL AVIÓN:                   " + CAPACIDAD
//                        + "\nKILOS EN EL AVIÓN:                     " + totalKilos
//                        + "\nCAPACIDAD DISPONIBLE A INGRESAR:       " + restante
//                        + "\nVALOR DEL ÚLTIMO BULTO INGRESADO:      " + kilos + "\n\n");
            }
            restante = CAPACIDAD - totalKilos;
            if (restante == 0) {
                salir = true;
            }
            if (!salir) {
                
                //System.out.println("Desea ingresar otro bulto?     Si-1     No-Diferente de 1");
                int decision = Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar otro bulto?     Si-1     No-Diferente de 1"));
               // int decision = leer.nextInt();
                salir = decision == 1 ? false : true; //esta linea es un condicional reducido (operador ternario)
            }
        }
        pesoPromedio = totalKilos / cont;
        System.out.println("\nCAPACIDAD DE KILOS DEL AVIÓN:         " + CAPACIDAD);
        System.out.println("TOTAL DE BULTOS REGISTRADOS:          " + cont);
        System.out.println("TOTAL DE KILOS REGISTRADOS:           " + totalKilos);
        System.out.println("EL PESO PROMEDIO DE LOS KILOS ES:     " + pesoPromedio);
        System.out.println("BULTO CON MAYOR PESO:                 " + mayor);
        System.out.println("BULTO CON MENOR PESO:                 " + menor);
        System.out.println("\nPESO BULTO            VALOR PESOS          VALOR DOLARES :");
        
       //mensaje+= 
        NumberFormat nf = NumberFormat.getInstance(new Locale("es", "CO")); //este objeto de tipo NumberFormat me permite formatear los números de acuerdo a la región
        NumberFormat nf1 = NumberFormat.getInstance(new Locale("en", "US"));
        lista2.forEach(
                //la e dice POR CADA ELEMENTO expresion LAMDA
                e -> System.out.println(e.peso + "                "
                        + nf.format(e.valor) + "                   "
                        + nf1.format(e.dolar)));
        
        
        
        
        mensaje = "\nCAPACIDAD DE KILOS DEL AVIÓN:                " + CAPACIDAD
                +"\nTOTAL DE BULTOS REGISTRADOS:                  " + cont
                +"\nTOTAL DE KILOS REGISTRADOS:                   " + totalKilos
                +"\nEL PESO PROMEDIO DE LOS KILOS ES:      " + pesoPromedio
                +"\nBULTO CON MAYOR PESO:                         " + mayor
                +"\nBULTO CON MENOR PESO:                         " + menor
                +"\nPESO BULTO            VALOR PESOS          VALOR DOLARES :\n"; 
            
        for (Bulto e : lista2) {
            mensaje+= e.peso + "                "
                        + nf.format(e.valor) + "                   "
                        + nf1.format(e.dolar)+ "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
        
    }
}
